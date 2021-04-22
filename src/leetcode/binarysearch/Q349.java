package leetcode.binarysearch;

import java.util.HashSet;
import java.util.Set;

public class Q349 {
	
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		
		int[] setArray = nums1;
		int[] searchArray = nums2;
        if (nums1.length > nums2.length) {
        	setArray = nums2;
        	searchArray = nums1;
        } 
        
        for (int num : setArray) {
        	if (!set.contains(num)) {
        		set.add(num);
        	}
        }
        
        Set<Integer> resultSet = new HashSet<>();
        for (int num : searchArray) {
        	if (set.contains(num) && !resultSet.contains(num)) {
        		resultSet.add(num);
        	}
        }
        
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
        	result[index++] = num;
        }
        
        return result;
    }
	
}
