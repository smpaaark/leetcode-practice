package leetcode.heap;

import java.util.*;

/**
 * LeetCode
 * 347. Top K Frequent Elements
 */
public class Q347 {

    public static void main(String[] args) {
        Q347 q = new Q347();
        q.topKFrequent(new int[] {1,1,1,2,2,3}, 2);
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        List<NumCount> list = new ArrayList<>();
        for (int num : map.keySet()) {
            list.add(new NumCount(num, map.get(num)));
        }

        PriorityQueue<NumCount> queue = new PriorityQueue<>((a, b) -> {
           return b.count - a.count;
        });

        for (NumCount object : list) {
            queue.offer(object);
        }

        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty() && k-- > 0) {
            NumCount numCount = queue.poll();
            result.add(numCount.num);
        }

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }

    static class NumCount {

        int num;
        int count;

        public NumCount(int num, int count) {
            this.num = num;
            this.count = count;
        }

        @Override
        public String toString() {
            return "NumCount{" +
                    "num=" + num +
                    ", count=" + count +
                    '}';
        }
    }

}
