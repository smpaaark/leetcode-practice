package leetcode.divideconquer;

public class Q53 {
	
	public static void main(String[] args) {
		Q53 q = new Q53();
		System.out.println(q.maxSubArray(new int[] {5,4,-1,7,8}));
	}
	
	public int maxSubArray(int[] nums) {
		return helper(nums, 0, nums.length-1);
	}

	public int helper(int[] nums, int start, int end){
		// Boundry
		if (start == end) {
			return nums[start];
		}
		
		if (start > end) {
			return Integer.MIN_VALUE;
		}
		
		// Declair
		int left_max = 0;
		int right_max = 0;
        int middle = (end - start) / 2 + start;
        int ml = 0;
        int mr = 0;

        // Find
        left_max = helper(nums, start, middle-1);
        right_max = helper(nums, middle+1, end);

        // Middle
        int sum = 0;
        for (int i = middle - 1; i >= start; i--){
            sum += nums[i];
            if (sum > ml) {
            	ml = sum;
            }
        }
        
        sum = 0;
        for (int i = middle + 1; i <= end; i++){
            sum += nums[i];
            if (sum > mr) {
            	mr = sum;
            }
        }
        
        int middle_value = ml + mr + nums[middle];
        
        return Math.max(Math.max(left_max, right_max), middle_value);
    }
	
}
