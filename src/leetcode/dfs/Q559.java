package leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

public class Q559 {
	
	private int maxDepth = 0;
	
	public static void main(String[] args) {
		Q559 q = new Q559();
		Node root = new Node(1);
		root.children = new ArrayList<Node>();
		root.children.add(new Node(3));
		root.children.add(new Node(2));
		root.children.add(new Node(4));
		
		root.children.get(0).children = new ArrayList<Node>();
		root.children.get(0).children.add(new Node(5));
		root.children.get(0).children.add(new Node(6));
		System.out.println(q.maxDepth(root));
	}
	
	public int maxDepth(Node root) {
		if (root == null) {
			return 0;
		}
		
        dfs(root, 1);
        
        return this.maxDepth;
    }
	
	private void dfs(Node node, int depth) {
		if (depth > this.maxDepth) {
			this.maxDepth = depth;
		}
		
		if (node.children == null) {
			return;
		}
		
		for (Node child : node.children) {
			dfs(child, depth + 1);
		}
	}

	static class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val, List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	};
	
}
