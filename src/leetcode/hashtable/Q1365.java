package leetcode.hashtable;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Q1365 {
	
	public static void main(String[] args) {
		Q1365 q = new Q1365();
		System.out.println(Arrays.toString(q.smallerNumbersThanCurrent(new int[] {8,1,2,2,3})));
	}
	
	public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
        	if (map.containsKey(num)) {
        		map.put(num, map.get(num) + 1);
        	} else {
        		map.put(num, 1);
        	}
        }
        
        int count = 0;
        for (int num : map.keySet()) {
        	int newCount = count + map.get(num);
        	map.put(num, count);
        	count = newCount;
        }
        
        for (int i = 0; i < nums.length; i++) {
        	nums[i] = map.get(nums[i]);
        }
        
        return nums;
    }
	
}
