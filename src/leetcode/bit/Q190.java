package leetcode.bit;

/**
 * LeetCode
 * 190. Reverse Bits
 */
public class Q190 {

    public static void main(String[] args) {
        Q190 q = new Q190();
        System.out.println(q.reverseBits(43261596));
    }

    public int reverseBits(int n) {
        if (n == 0) {
            return 0;
        }

        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            if ((n & 1) == 1) {
                result++;
            }

            n >>= 1;
        }

        return result;
    }

}
