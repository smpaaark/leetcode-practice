package leetcode.array;

import java.util.Arrays;

public class Q1480 {
	
	public static void main(String[] args) {
		Q1480 q = new Q1480();
		System.out.println(Arrays.toString(q.runningSum(new int[] {1, 2, 3, 4})));
		System.out.println(Arrays.toString(q.runningSum(new int[] {1, 1, 1, 1, 1})));
		System.out.println(Arrays.toString(q.runningSum(new int[] {3, 1, 2, 10, 1})));
	}
	
	public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
        	nums[i] += nums[i - 1];
        }
		
		return nums;
    }
	
}
