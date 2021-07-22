package leetcode.interview.dp;

/**
 * LeetCode
 * 53. Maximum Subarray
 * Dynamic Programming
 */
public class Q53 {

    public int maxSubArray(int[] nums) {
        int max = nums[0]; // 결과로 반환할 최대값
        int prevMaxSum = nums[0]; // 이전 배열 값의 최대값
        for (int i = 1; i < nums.length; i++) {
            prevMaxSum = Math.max(nums[i], nums[i] + prevMaxSum); // 이전 배열 값의 최대값을 구한다. (현재 값과 (이전 값 + 현재값) 중 최대값)
            max = Math.max(prevMaxSum, max); // 결과로 반활할 최대값을 새로 저장한다.
        }

        return max; // 최대값 반환
    }
    
}
