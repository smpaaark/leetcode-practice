package leetcode.divideconquer;

import java.util.HashMap;
import java.util.Map;

public class Q169 {
	
	public static void main(String[] args) {
		Q169 q = new Q169();
		System.out.println(q.majorityElement(new int[] {3,2,3}));
		System.out.println(q.majorityElement(new int[] {2,2,1,1,1,2,2}));
	}
	
	public int majorityElement(int[] nums) {
        int compareSize = nums.length / 2;
        int maxNum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
        	map.put(num, map.getOrDefault(num, 0) + 1);
        	if (map.get(num) >= compareSize) {
        		maxNum = (map.getOrDefault(maxNum, 0) < map.get(num)) ? num : maxNum;
        	}
        }
        
        return maxNum;
    }
	
	public int majorityElement_other(int[] nums) {
        
        return findMajority(nums, 0, nums.length-1);
    }
    
    private int findMajority(int[] nums, int low, int high) {
        if (low == high)
            return nums[low];
        
        int mid = low + (high-low)/2;
        
        int left = findMajority(nums, low, mid);
        int right = findMajority(nums, mid+1, high);
        
        if (left == right)
            return left;
        
        int countLeft = getFreq(nums, left, low, mid);
        int countRight = getFreq(nums, right, mid+1, high);
        if (countLeft > countRight)
            return left;
        return right;
    }
    
    private int getFreq(int[] nums, int val, int low, int high) {
        int res = 0;
        
        for (int i = low; i <= high; i++) {
            if (nums[i] == val)
                res++;
        }
        return res;
    }
    
}
