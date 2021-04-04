package leetcode.queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Q621 {
	
	public static void main(String[] args) {
		Q621 q = new Q621();
//		System.out.println(q.leastInterval(new char[] {'A','A','A','B','B','B'}, 2));
//		System.out.println(q.leastInterval(new char[] {'A','A','A','B','B','B'}, 0));
		System.out.println(q.leastInterval(new char[] {'A','A','A','A','A','A','B','C','D','E','F','G'}, 2));
//		System.out.println(q.leastInterval(new char[] {'A','A','A','B','B','B', 'C','C','C', 'D', 'D', 'E'}, 2));
	}
	
	public int leastInterval(char[] tasks, int n) {
        Queue<Character> q = new LinkedList<>();
        for (char c : tasks) {
        	q.offer(c);
        }
        
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        int tempArrayCount = 0;
        int[] tempArray = new int[26];
        while (!q.isEmpty()) {
        	for (int i = 0; i < tempArray.length; i++) {
        		char c = (char)(i + 'A');
        		if (tempArray[i] > 0 && map.get(c) <= result) {
        			System.out.print(c + " ");
        			result++;
        			tempArray[i]--;
        			tempArrayCount--;
        		}
        	}
        	
        	char task = q.poll();
        	if (!map.containsKey(task)) {
        		System.out.print(task + " ");
        		result++;
        		map.put(task, result + n);
        	} else if (map.get(task) <= result) {
        		System.out.print(task + " ");
        		result++;
        		map.put(task, result + n);
        	} else {
        		tempArray[task - 'A']++;
        		tempArrayCount++;
        	}
        }
        
        while (tempArrayCount > 0) {
        	for (int i = 0; i < tempArray.length; i++) {
        		char c = (char)(i + 'A');
        		if (tempArray[i] > 0 && map.get(c) <= result) {
        			System.out.print(c + " ");
        			result++;
        			tempArray[i]--;
        			tempArrayCount--;
        		}
        	}
        	
        	if (tempArrayCount > 0) {
	        	System.out.print("idle ");
	        	result++;
        	}
        }
        
        return result;
    }
	
}
