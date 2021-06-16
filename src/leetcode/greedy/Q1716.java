package leetcode.greedy;

/**
 * LeetCode
 * 1716. Calculate Money in Leetcode Bank
 */
public class Q1716 {

    public int totalMoney(int n) {
        int weekCount = n / 7;
        int result = 0;
        for (int i = 0; i < weekCount; i++) {
            result += 28 + (i * 7);
        }

        int restCount = n % 7;
        int start = weekCount + 1;
        for (int i = 0; i < restCount; i++) {
            result += start++;
        }

        return result;
    }

}
