package leetcode.interview.divideconquer;

/**
 * LeetCode
 * 53. Maximum Subarray
 * Divide and Conquer
 */
public class Q53 {

    public static void main(String[] args) {
        Q53 q = new Q53();
        System.out.println(q.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    }

    public int maxSubArray(int[] nums) {
        return divideAndConquer(nums, 0, nums.length - 1);
    }

    private int divideAndConquer(int[] nums, int start, int end) {
        if (start >= end) { // 1개까지 분할되면 그 값을 리턴
            return nums[start];
        }

        int mid = (start + end) / 2;
        int leftMax = divideAndConquer(nums, start, mid); // 왼쪽의 최대값
        int rightMax = divideAndConquer(nums,mid + 1, end); // 오른쪽의 최대값
        int midMax = divideAndConquerMid(nums, start, mid, end); // 중간의 최대값
        return Math.max(midMax, Math.max(leftMax, rightMax)); // 셋 중에 가장 큰 값
    }

    private int divideAndConquerMid(int[] nums, int start, int mid, int end) {
        int leftMax = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid - 1; i >= start; i--) { // mid 왼쪽부터 내려가면서 최대 값을 구한다.
            sum += nums[i];
            if (sum > leftMax) {
                leftMax = sum;
            }
        }

        int rightMax = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid; i <= end; i++) { // mid부터 올라가면서 최대 값을 구한다.
            sum += nums[i];
            if (sum > rightMax) {
                rightMax = sum;
            }
        }

        // 위에서 구한 left와 right와 left + right중 최대값을 리턴
        if (leftMax != Integer.MIN_VALUE && rightMax != Integer.MIN_VALUE) {
            return Math.max(leftMax + rightMax, Math.max(leftMax, rightMax));
        }

        return Math.max(leftMax, rightMax);
    }

}
