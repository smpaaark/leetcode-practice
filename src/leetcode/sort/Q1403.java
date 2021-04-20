package leetcode.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Q1403 {
	
	public static void main(String[] args) {
		Q1403 q = new Q1403();
		System.out.println(q.minSubsequence(new int[] {4,3,10,9,8}));
		System.out.println(q.minSubsequence(new int[] {4,4,7,6,7}));
	}
	
	public List<Integer> minSubsequence(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {return b - a;});
        
        int sum = 0;
        for (int num : nums) {
        	sum += num;
        	queue.offer(num);
        }
        
        List<Integer> result = new ArrayList<>();
        int tempSum = 0;
        while (!queue.isEmpty()) {
        	int tempNum = queue.poll();
        	result.add(tempNum);
        	if (sum - tempNum >= tempSum + tempNum) {
        		sum -= tempNum;
        		tempSum += tempNum;
        	} else {
        		return result;
        	}
        }
        
        return result;
    }
	
}
