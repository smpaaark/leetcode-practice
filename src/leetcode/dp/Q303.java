package leetcode.dp;

/**
 * LeetCode
 * 303. Range Sum Query - Immutable
 */
public class Q303 {

    static class NumArray {

        private int[] dp;

        public NumArray(int[] nums) {
            dp = new int[nums.length];
            dp[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                dp[i] = dp[i - 1] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            return left > 0 ? dp[right] - dp[left - 1] : dp[right];
        }

    }

}
