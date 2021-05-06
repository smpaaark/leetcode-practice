package leetcode.graph;

import java.util.*;

/**
 * LeetCode
 * 1387. Sort Integers by The Power Value
 */
public class Q1387 {

    public static void main(String[] args) {
        Q1387 q = new Q1387();
        System.out.println(q.getKth(12, 15, 2));

//        int num = 9;
//        int count = 0;
//        while (num != 1) {
//            count++;
//            if (num % 2 == 0) {
//                num /= 2;
//            } else {
//                num = (num * 3) + 1;
//            }
//        }
//
//        System.out.println(count);
    }

    public int getKth(int lo, int hi, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            if (map.get(a) > map.get(b)) {
                return 1;
            } else if (map.get(a) < map.get(b)) {
                return -1;
            } else {
                return a - b;
            }
        });

        for (int i = lo; i <= hi; i++) {
            if (!map.containsKey(i)) {
                if (i == 1) {
                    map.put(i, 0);
                } else if (i % 2 == 0) {
                    map.put(i, recursion(i / 2, map, pq));
                } else {
                    map.put(i, recursion(i * 3 + 1, map, pq));
                }
            }
            pq.offer(i);
        }

        for (int i = 0; i < k - 1; i++) {
            pq.poll();
        }

        return pq.poll();
    }

    private Integer recursion(int num, Map<Integer, Integer> map, PriorityQueue<Integer> pq) {
        if (num == 1) {
            return 1;
        } else if (map.containsKey(num)) {
            return map.get(num) + 1;
        }

        if (num % 2 == 0) {
            map.put(num, recursion(num / 2, map, pq));
        } else {
            map.put(num, recursion(num * 3 + 1, map, pq));
        }

        return map.get(num) + 1;
    }

}
