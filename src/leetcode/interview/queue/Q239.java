package leetcode.interview.queue;

import java.util.*;

/**
 * LeetCode
 * 239. Sliding Window Maximum
 * Queue
 */
public class Q239 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<NumIndex> priorityQueue = new PriorityQueue<>((a, b) -> {
            return b.val - a.val;
        });

        int[] result = new int[nums.length - k + 1];
        int numsIndex = 0;
        int resultIndex = 0;
        while (numsIndex < nums.length) {
            queue.offer(nums[numsIndex]);
            priorityQueue.offer(new NumIndex(nums[numsIndex], numsIndex++));

            if (queue.size() == k) {
                int peekIndex = priorityQueue.peek().index;
                while (!(peekIndex >= resultIndex && peekIndex <= resultIndex + k)) {
                    priorityQueue.poll();
                    peekIndex = priorityQueue.peek().index;
                }
                result[resultIndex++] = priorityQueue.peek().val;
                queue.poll();
            }
        }

        return result;
    }

    class NumIndex {

        int val;
        int index;

        public NumIndex(int val, int index) {
            this.val = val;
            this.index = index;
        }

    }

    public static void main(String[] args) {
        Q239 q = new Q239();
        System.out.println(q.maxSlidingWindow2(new int[]{1,3,-1,-3,5,3,6,7}, 3));
    }

    public int[] maxSlidingWindow2(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int resultIndex = 0;
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && queue.peek() < i - k + 1) { // max값이 k 범위 밖의 좌측 값이면 제거
                queue.poll();
            }
            
            while (!queue.isEmpty() && nums[queue.peekLast()] < nums[i]) { // 큐에 남아있는 오른쪽 값들이 현재 값보다 작으면 다 poll (의미 없는 값이기 때문에)
                queue.pollLast();
            }

            queue.offer(i); // 현재 값 offer
            if (i >= k - 1) { // 창 갯수가 채워졌을때부터 계속 result에 peek 값을 저장
                result[resultIndex++] = nums[queue.peek()];
            }
        }
        return result;
    }

}
