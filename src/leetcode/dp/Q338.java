package leetcode.dp;

/**
 * LeetCode
 * 338. Counting Bits
 */
public class Q338 {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + "(" + Integer.toBinaryString(i) + "): " + Integer.bitCount(i));
        }
    }

    public int[] countBits(int n) {
        int[] f = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            f[i] = f[i >> 1] + (i & 1);
        }

        return f;
    }

}
