package leetcode.heap;

import java.util.PriorityQueue;

/**
 * LeetCode
 * 1464. Maximum Product of Two Elements in an Array
 */
public class Q1464 {

    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {
            return b - a;
        });

        for (int num : nums) {
            queue.offer(num);
        }

        return (queue.poll() - 1) * (queue.poll() - 1);
    }

}
