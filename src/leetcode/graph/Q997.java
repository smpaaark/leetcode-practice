package leetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q997 {

	public static void main(String[] args) {
		Q997 q = new Q997();
//		System.out.println(q.findJudge(2, new int[][] {{1, 2}}));
//		System.out.println(q.findJudge(3, new int[][] {{1,3},{2,3}}));
		System.out.println(q.findJudge(2, new int[][] {}));
	}
	
	public int findJudge(int N, int[][] trust) {
		if (N < 2) {
			return N;
		}
		
        List<Integer>[] graph = new ArrayList[N + 1];
        for (int i = 1; i < graph.length; i++) {
        	graph[i] = new ArrayList<>();
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] array : trust) {
        	graph[array[0]].add(array[1]);
        	map.put(array[1], map.getOrDefault(array[1], 0) + 1);
        }
        
        for (int i = 1; i < graph.length; i++) {
        	if (graph[i].size() == 0 && map.getOrDefault(i, 0) == N - 1) {
        		return i;
        	}
        }
        
        return -1;
    }
	
}
