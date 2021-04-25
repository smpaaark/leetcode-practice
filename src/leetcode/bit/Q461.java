package leetcode.bit;

/**
 * LeetCode
 * 461. Hamming Distance
 *
 */
public class Q461 {

    public static void main(String[] args) {
        Q461 q = new Q461();
        System.out.println(q.hammingDistance(1, 4));
    }

    public int hammingDistance(int x, int y) {
        int xorNum = x ^ y;
        int result = 0;
        while (xorNum > 0) {
            if ((xorNum & 1) == 1) {
                result++;
            }

            xorNum >>= 1;
        }

        return result;
    }

    /*public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }*/

}
