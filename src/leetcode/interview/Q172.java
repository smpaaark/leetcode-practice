package leetcode.interview;

/**
 * LeetCode
 * 172. Factorial Trailing Zeroes
 */
public class Q172 {

    public int trailingZeroes(int n) {
        int result = 0;
        while (n > 0) {
            n /= 5;
            result += n;
        }

        return result;
    }

}
