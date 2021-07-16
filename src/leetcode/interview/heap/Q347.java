package leetcode.interview.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * LeetCode
 * 347. Top K Frequent Elements
 * Heap
 */
public class Q347 {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) { // Map에 숫자와 빈도수를 저장한다.
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((a, b) -> { // Max Heap 생성, Map은 Entry로 넣어야 한다.
           return b.getValue() - a.getValue();
        });

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(entry);
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) { // k개 만큼 key를 가져와서 결과에 저장
            result[i] = queue.poll().getKey();
        }

        return result;
    }

}
