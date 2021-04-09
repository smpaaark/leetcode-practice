package leetcode.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Q451 {
	
	public static void main(String[] args) {
		Q451 q = new Q451();
//		System.out.println(q.frequencySort("tree"));
//		System.out.println(q.frequencySort("cccaaa"));
		System.out.println(q.frequencySort("Aabb"));
	}
	
	public String frequencySort(String s) {
        PriorityQueue<CharCount> queue = new PriorityQueue<>((a, b) -> {
        	return b.count - a.count;
        });
        
        char[] array = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : array) {
        	if (map.containsKey(c)) {
        		map.put(c, map.get(c) + 1);
        	} else {
        		map.put(c, 1);
        	}
        }
        
        for (char c : map.keySet()) {
        	queue.offer(new CharCount(c, map.get(c)));
        }
        
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
        	CharCount temp = queue.poll();
        	for (int i = 0; i < temp.count; i++) {        		
        		sb.append(temp.c);
        	}
        }
        
        return sb.toString();
    }
	
	static class CharCount {
		private char c;
		private int count;
		
		public CharCount(char c, int count) {
			super();
			this.c = c;
			this.count = count;
		}
		
		
	}
	
}
