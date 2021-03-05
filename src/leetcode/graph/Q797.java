package leetcode.graph;

import java.util.ArrayList;
import java.util.List;

public class Q797 {
	
	private List<List<Integer>> result = new ArrayList<>();
	
	public static void main(String[] args) {
		Q797 q = new Q797();
//		List<List<Integer>> result = q.allPathsSourceTarget(new int[][] {{1, 2}, {3}, {3}, {3}});
		List<List<Integer>> result = q.allPathsSourceTarget(new int[][] {{4,3,1},{3,2,4},{3},{4},{4}});
		for (List<Integer> list : result) {
			for (Integer num : list) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
	
	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		
        for (int i = 0; i < graph[0].length; i++) {
        	boolean[] visit = new boolean[graph.length];
        	ArrayList<Integer> path = new ArrayList<Integer>();
        	path.add(0);
        	visit[0] = true;
        	dfs(graph[0][i], graph.length - 1, graph, visit, path);
        }
        
        return this.result;
    }

	private void dfs(int currentLabel, int lastLabel, int[][] graph, boolean[] visit, List<Integer> path) {
		if (visit[currentLabel]) {
			return;
		}
		
		if (currentLabel == lastLabel) {
			path.add(currentLabel);
			this.result.add(new ArrayList<>(path));
			return;
		}
		
		visit[currentLabel] = true;
		path.add(currentLabel);
		for (int i = 0; i < graph[currentLabel].length; i++) {
			if (!visit[graph[currentLabel][i]]) {
				dfs(graph[currentLabel][i], lastLabel, graph, visit, path);
				visit[graph[currentLabel][i]] = false;
				path.remove(path.size() - 1);
			}
		}
	}
	
}
