package leetcode.array;

import java.util.Arrays;

public class Q1470 {
	
	public static void main(String[] args) {
		Q1470 q = new Q1470();
		System.out.println(Arrays.toString(q.shuffle(new int[] {2,5,1,3,4,7}, 3)));
		System.out.println(Arrays.toString(q.shuffle(new int[] {1,2,3,4,4,3,2,1}, 4)));
		System.out.println(Arrays.toString(q.shuffle(new int[] {1,1,2,2}, 2)));
	}
	
	public int[] shuffle(int[] nums, int n) {
        int[] resultArray = new int[nums.length];
        int xIndex = 0;
        int yIndex = nums.length / 2;
        for (int i = 0; i < resultArray.length; i++) {
        	if (i % 2 == 0) {
        		resultArray[i] = nums[xIndex++];
        	} else {
        		resultArray[i] = nums[yIndex++];
        	}
        }
        
        return resultArray;
    }
	
	public int[] shuffle_other(int[] nums, int n) {
		int[] shuffled = new int[nums.length];
        for(int i = 0; i < n; i++){
            shuffled[i * 2] = nums[i];
            shuffled[i * 2 + 1] = nums[i + n];
        }
        
        return shuffled;
    }
	
}
