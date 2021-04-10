package leetcode.graph;

import java.util.HashSet;
import java.util.Set;

public class Q1791 {
	
	public int findCenter(int[][] edges) {
        Set<Integer> set = new HashSet<>();
        for (int[] edge : edges) {
            for (int i = 0; i < 2; i++) {
                if (set.contains(edge[i])) {
                	return edge[i];
                } else {
                	set.add(edge[i]);
                }
            }
        }
        
        return 0;
    }
	
}
