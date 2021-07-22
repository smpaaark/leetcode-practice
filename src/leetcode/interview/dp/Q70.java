package leetcode.interview.dp;

/**
 * LeetCode
 * 70. Climbing Stairs
 * Dynamic Programming
 */
public class Q70 {

    public int climbStairs(int n) {
        if (n <= 2) { // 2개 까지는 n 반환
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) { // (dp[i - 2] 계단에서 +2로 오는 경우) + (dp[i - 1] 계단에서 +1로 오는 경우)
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        return dp[n];
    }

}
