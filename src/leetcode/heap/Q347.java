package leetcode.heap;

import java.util.*;

/**
 * LeetCode
 * 347. Top K Frequent Elements
 */
public class Q347 {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(nums).forEach(num -> map.put(num, map.getOrDefault(num, 0) + 1));

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((a, b) -> {
            return b.getValue() - a.getValue();
        });

        map.entrySet().forEach(queue::offer);

        int[] result = new int[k];
        int index = 0;
        while (k-- > 0) {
            result[index++] = queue.poll().getKey();
        }

        return result;
    }

}
