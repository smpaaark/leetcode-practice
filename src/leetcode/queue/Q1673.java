package leetcode.queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * LeetCode
 * 1673. Find the Most Competitive Subsequence
 */
public class Q1673 {

    public static void main(String[] args) {
        Q1673 q = new Q1673();
        System.out.println(Arrays.toString(q.mostCompetitive(new int[] {71,18,52,29,55,73,24,42,66,8,80,2}, 3)));
    }

    public int[] mostCompetitive(int[] nums, int k) {
        Deque<Integer> dequeue = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            if (dequeue.isEmpty()) {
                dequeue.offer(nums[i]);
            } else if (i <= nums.length - k && dequeue.peekFirst() > nums[i]) {
                dequeue.clear();
                dequeue.offer(nums[i]);
            } else if (dequeue.size() < k && dequeue.peekLast() <= nums[i]) {
                dequeue.offer(nums[i]);
            } else {
                boolean isPoll = false;
                while (k - dequeue.size() < nums.length - i && dequeue.peekLast() > nums[i]) {
                    dequeue.pollLast();
                    isPoll = true;
                }

                if (isPoll || dequeue.size() < k) {
                    dequeue.offerLast(nums[i]);
                }
            }
        }

        int[] result = new int[k];
        int i = 0;
        while (!dequeue.isEmpty()) {
            result[i++] = dequeue.pollFirst();
        }

        return result;
    }

}
