package leetcode.interview.heap;

import java.util.PriorityQueue;

/**
 * LeetCode
 * 215. Kth Largest Element in an Array
 * Heap
 */
public class Q215 {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {
           return b - a;
        });

        for (int num : nums) {
            queue.offer(num);
        }

        for (int i = 1; i < k; i++) {
            queue.poll();
        }

        return queue.poll();
    }

    public int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue= new PriorityQueue<>(); // Min Heap 생성

        for (int i = 0; i < nums.length; i++){
            priorityQueue.add(nums[i]);
            if (priorityQueue.size() > k) { // heap의 사이즈가 k보다 크면 최소값을 제거한다.
                priorityQueue.remove();
            }
        }

        return priorityQueue.remove(); // 마지막엔 가장 큰 k개의 수만 heap에 남아있게 되므로 남은 값 중 최소값을 반환한다.
    }

}
