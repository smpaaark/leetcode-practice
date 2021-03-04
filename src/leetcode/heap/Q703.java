package leetcode.heap;

import java.util.PriorityQueue;

public class Q703 {

	public static void main(String[] args) {
		KthLargest kthLargest = new KthLargest(3, new int[] {4, 5, 8, 2});
		System.out.println(kthLargest.add(3));   // return 4
		System.out.println(kthLargest.add(5));   // return 5
		System.out.println(kthLargest.add(10));  // return 5
		System.out.println(kthLargest.add(9));   // return 8
		System.out.println(kthLargest.add(4));   // return 8
	}
	
	static class KthLargest {
		
		private int k;
		private PriorityQueue<Integer> q = new PriorityQueue<>();
		
	    public KthLargest(int k, int[] nums) {
	        this.k = k;
	        for (int num : nums) {
	        	this.q.offer(num);
	        }
	    }
	    
	    public int add(int val) {
	        this.q.offer(val);
	        int size = q.size();
	        
	        while (size-- != k) {
	        	q.poll();
	        }
	        
	        return q.peek();
	    }
	}
	
}
