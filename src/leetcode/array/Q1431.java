package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class Q1431 {
	
	public static void main(String[] args) {
		Q1431 q = new Q1431();
		System.out.println(q.kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3));
		System.out.println(q.kidsWithCandies(new int[] {4,2,1,1,2}, 1));
		System.out.println(q.kidsWithCandies(new int[] {12,1,12}, 10));
	}
	
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int maxNum = Integer.MIN_VALUE;
		for (int num : candies) {
			if (num > maxNum) {
				maxNum = num;
			}
		}
        
		List<Boolean> result = new ArrayList<>();
        for (int num : candies) {
        	result.add(num + extraCandies >= maxNum ? true : false);
        }
        
        return result;
    }
	
}
