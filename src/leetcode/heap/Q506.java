package leetcode.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * LeetCode
 * 506. Relative Ranks
 */
public class Q506 {

    public static void main(String[] args) {
        Q506 q = new Q506();
        System.out.println(q.findRelativeRanks(new int[]{5,4,3,2,1}));
    }

    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {
            return b - a;
        });

        for (int sValue : score) {
            queue.offer(sValue);
        }

        int rank = 1;
        Map<Integer, String> map = new HashMap<>();
        while (!queue.isEmpty()) {
            int pScore = queue.poll();
            if (rank == 1) {
                map.put(pScore, "Gold Medal");
            } else if (rank == 2) {
                map.put(pScore, "Silver Medal");
            } else if (rank == 3) {
                map.put(pScore, "Bronze Medal");
            } else {
                map.put(pScore, String.valueOf(rank));
            }

            rank++;
        }

        String[] result = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            result[i] = map.get(score[i]);
        }

        return result;
    }

}
