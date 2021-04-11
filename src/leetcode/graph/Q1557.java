package leetcode.graph;

import java.util.ArrayList;
import java.util.List;

public class Q1557 {

	public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
		boolean[] visit = new boolean[n];
        for (List<Integer> edge : edges) {
        	if (!visit[edge.get(1)]) {
        		visit[edge.get(1)] = true;
        	}
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < visit.length; i++) {
        	if (!visit[i]) {
        		result.add(i);
        	}
        }
        
        return result;
    }
	
}
