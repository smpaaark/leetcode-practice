package leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q1512 {
	
	public static void main(String[] args) {
		Q1512 q = new Q1512();
//		System.out.println(q.numIdenticalPairs(new int[] {1,2,3,1,1,3}));
//		System.out.println(q.numIdenticalPairs(new int[] {1,1,1,1}));
		System.out.println(q.numIdenticalPairs_other(new int[] {1,2,3}));
	}
	
	public int numIdenticalPairs(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
        	if (map.containsKey(nums[i])) {
        		result += map.get(nums[i]).size();
        		map.get(nums[i]).add(i);
        	} else {
        		List<Integer> list = new ArrayList<>();
        		list.add(i);
        		map.put(nums[i], list);
        	}
        }
        
        return result;
    }
	
	public int numIdenticalPairs_other(int[] nums) {
        int[] hash = new int[101];
        for(int n : nums) hash[n]++;
        int res = 0;
        for(int i = 1; i <= 100; i++) {
            if(hash[i] >= 2) res += hash[i] * (hash[i] - 1) / 2;
        }
        return res;
    }
	
}
