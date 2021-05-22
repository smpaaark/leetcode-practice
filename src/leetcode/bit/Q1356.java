package leetcode.bit;

import java.util.PriorityQueue;

/**
 * LeetCode
 * 1356. Sort Integers by The Number of 1 Bits
 */
public class Q1356 {

    public int[] sortByBits(int[] arr) {
        PriorityQueue<BitCount> queue = new PriorityQueue<>((a, b) -> {
            if (a.bitCount == b.bitCount) {
                return a.num - b.num;
            } else {
                return a.bitCount - b.bitCount;
            }
        });

        for (int num : arr) {
            queue.offer(new BitCount(num, Integer.bitCount(num)));
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = queue.poll().getNum();
        }

        return arr;
    }

    static class BitCount {

        private int num;
        private int bitCount;

        public BitCount(int num, int bitCount) {
            this.num = num;
            this.bitCount = bitCount;
        }

        public int getNum() {
            return num;
        }

    }

}
