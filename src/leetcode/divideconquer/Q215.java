package leetcode.divideconquer;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * LeetCode
 * 215. Kth Largest Element in an Array
 * 시간 복잡도: O(nlogn)
 * 공간 복잡도: O(n)
 */
public class Q215 {

    public static void main(String[] args) {
        Q215 q = new Q215();
        System.out.println(q.findKthLargest(new int[] {3,2,3,1,2,4,5,5,6}, 4));
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {
            return b - a;
        });

        for (int num : nums) {
            queue.offer(num);
        }

        for (int i = 0; i < k - 1; i++) {
            queue.poll();
        }

        return queue.poll();
    }

}
