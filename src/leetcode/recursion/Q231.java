package leetcode.recursion;

/**
 * LeetCode
 * 231. Power of Two
 */
public class Q231 {

    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }

        if (n < 1 || n % 2 > 0) {
            return false;
        }

        return isPowerOfTwo(n / 2);
    }

}
