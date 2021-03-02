package leetcode.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Q933 {
	
	public static void main(String[] args) {
		RecentCounter obj = new RecentCounter();
		System.out.println(obj.ping(1));
		System.out.println(obj.ping(100));
		System.out.println(obj.ping(3001));
		System.out.println(obj.ping(3002));
	}

	static class RecentCounter {
		
		private Queue<Integer> q;
		
		public RecentCounter() {
			q = new LinkedList<>();
		}
	    
	    public int ping(int t) {
	    	q.offer(t);
	    	
	    	while (!q.isEmpty()) {
	    		if (q.peek() >= t - 3000 && q.peek() <= t) {
	    			break;
	    		} else {
	    			q.poll();
	    		}
	    	}
	    	
	    	return q.size();
	    }
	    
	}
	
}
