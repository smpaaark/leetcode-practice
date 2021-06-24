package leetcode.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode
 * 225. Implement Stack using Queues
 */
public class Q225 {

    class MyStack {

        private Queue<Integer> realQueue = new LinkedList<>();
        private Queue<Integer> tempQueue = new LinkedList<>();

        /** Initialize your data structure here. */
        public MyStack() {

        }

        /** Push element x onto stack. */
        public void push(int x) {
            if (empty()) {
                realQueue.add(x);
            } else {
                while (!empty()) {
                    tempQueue.add(realQueue.poll());
                }

                realQueue.add(x);
                while (!tempQueue.isEmpty()) {
                    realQueue.add(tempQueue.poll());
                }
            }
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            return realQueue.poll();
        }

        /** Get the top element. */
        public int top() {
            return realQueue.peek();
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return realQueue.isEmpty();
        }

    }

}
