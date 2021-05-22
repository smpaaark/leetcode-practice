package leetcode.bit;

/**
 * LeetCode
 * 1837. Sum of Digits in Base K
 */
public class Q1837 {

    public int sumBase(int n, int k) {
        int sum = 0;
        while (n > 0) {
            sum += n % k;
            n /= k;
        }

        return sum;
    }

}
