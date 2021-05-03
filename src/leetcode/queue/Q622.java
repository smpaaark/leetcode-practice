package leetcode.queue;

/**
 * LeetCode
 * 622. Design Circular Queue
 */
public class Q622 {

    public static void main(String[] args) {
        MyCircularQueue myQueue = new MyCircularQueue(8);
        System.out.println(myQueue.enQueue(3));
        System.out.println(myQueue.enQueue(9));
        System.out.println(myQueue.enQueue(5));
        System.out.println(myQueue.enQueue(0));
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.isFull());
        System.out.println(myQueue.isFull());
        System.out.println(myQueue.Rear());
        System.out.println(myQueue.Rear());
        System.out.println(myQueue.deQueue());

        System.out.println(myQueue);
    }

    static class MyCircularQueue {

        private int[] queue;
        private int frontIndex = -1;
        private int rearIndex = -1;
        private int size = 0;

        public MyCircularQueue(int k) {
            queue = new int[k];
        }

        public boolean enQueue(int value) {
            if (isFull()) {
                return false;
            }

            rearIndex = (rearIndex + 1) % queue.length;
            queue[rearIndex] = value;
            size++;

            if (size == 1) {
                frontIndex = rearIndex;
            }

            return true;
        }

        public boolean deQueue() {
            if(isEmpty()) {
                return false;
            }

            frontIndex++;
            size--;

            if (size == 0) {
                frontIndex = -1;
                rearIndex = -1;
            } else if (frontIndex > queue.length - 1) {
                frontIndex = 0;
            }

            return true;
        }

        public int Front() {
            if(isEmpty()) {
                return -1;
            }

            return queue[frontIndex];
        }

        public int Rear() {
            if(isEmpty()) {
                return -1;
            }

            return queue[rearIndex];
        }

        public boolean isEmpty() {
            return size > 0 ? false : true;
        }

        public boolean isFull() {
            return size == queue.length ? true : false;
        }

    }

}
