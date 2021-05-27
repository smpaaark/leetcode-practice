package leetcode.greedy;

import java.util.PriorityQueue;

/**
 * LeetCode
 * 1710. Maximum Units on a Truck
 */
public class Q1710 {

    public static void main(String[] args) {
        Q1710 q = new Q1710();
        System.out.println(q.maximumUnits(new int[][]{{5,10},{2,5},{4,7},{3,9}}, 10));
    }

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        PriorityQueue<Integer[]> queue = new PriorityQueue<>((a, b) -> {
            return b[1] - a[1];
        });

        for (int[] boxType : boxTypes) {
            queue.offer(new Integer[] {boxType[0], boxType[1]});
        }

        int maximumUnit = 0;
        while (!queue.isEmpty()) {
            Integer[] boxType = queue.poll();
            if (boxType[0] >= truckSize) {
                return maximumUnit += truckSize * boxType[1];
            } else {
                maximumUnit += boxType[0] * boxType[1];
                truckSize -= boxType[0];
            }
        }

        return maximumUnit;
    }

}
