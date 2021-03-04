package leetcode.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q1046 {
	
	public static void main(String[] args) {
		Q1046 q = new Q1046();
		System.out.println(q.lastStoneWeight(new int[] {2, 7, 4, 1, 8, 1}));
	}
	
	public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : stones) {
        	q.offer(num);
        }
        
        while (q.size() > 1) {
        	int result = q.poll() - q.poll();
        	if (result > 0) {
        		q.offer(result);
        	}
        }
        
        return !q.isEmpty() ? q.poll() : 0;
    }
	
}
