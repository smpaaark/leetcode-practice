package leetcode.dp;

/**
 * LeetCode
 * 70. Climbing Stairs
 */
public class Q70 {

    public int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        return dp[n];
    }

}
