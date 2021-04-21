package leetcode.sort;

import java.util.PriorityQueue;

public class Q1502 {
	
	public static void main(String[] args) {
		Q1502 q = new Q1502();
		System.out.println(q.canMakeArithmeticProgression(new int[] {-68,-96,-12,-40,16}));
	}
	
	public boolean canMakeArithmeticProgression(int[] arr) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : arr) {
        	queue.offer(num);
        }
        
        int differrence = queue.poll() - queue.peek();
        int before = queue.poll();
        while (!queue.isEmpty()) {
        	int temp = before - queue.peek();
        	if (temp != differrence) {
        		return false;
        	}
        	before = queue.poll();
        }
        
        return true;
    }
	
}
