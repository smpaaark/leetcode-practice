package leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

public class Q1748 {
	
	public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
        	if (map.containsKey(num)) {
        		map.put(num, map.get(num) + 1);
        	} else {
        		map.put(num, 1);
        	}
        }
        
        int result = 0;
        for (int key : map.keySet()) {
        	if (map.get(key) == 1) {
        		result += key;
        	}
        }
        
        return result;
    }
	
}
