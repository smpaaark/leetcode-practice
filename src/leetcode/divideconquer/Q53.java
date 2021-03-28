package leetcode.divideconquer;

public class Q53 {
	
	public static void main(String[] args) {
		Q53 q = new Q53();
		System.out.println(q.maxSubArray(new int[] {5,4,-1,7,8}));
	}
	
	public int maxSubArray(int[] nums) {
        return recursion(nums, 0, nums.length - 1);
    }

	private int recursion(int[] nums, int start, int end) {
		if (start == end) {
			return nums[start];
		}
		
		if (start > end) {
			return Integer.MIN_VALUE;
		}
		
		int mid = (start + end) / 2;
		
		int leftMax = recursion(nums, start, mid - 1);
		int rightMax = recursion(nums, mid + 1, end);
		
		int tempLeftMax = 0;
		int sum = 0;
		for (int i = mid - 1; i >= start; i--) {
			sum += nums[i];
			if (sum > tempLeftMax) {
				tempLeftMax = sum;
			}
		}
		
		int tempRightMax = 0;
		sum = 0;
		for (int i = mid + 1; i <= end; i++) {
			sum += nums[i];
			if (sum > tempRightMax) {
				tempRightMax = sum;
			}
		}
		
		int midSumMax = tempLeftMax + tempRightMax + nums[mid];
		
		return Math.max(Math.max(leftMax, rightMax), midSumMax);
	}
	
}
