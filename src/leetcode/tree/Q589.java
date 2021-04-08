package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class Q589 {

	public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
		if (root != null) {
        	recursion(root, result);
        }
		
		return result;
    }
	
	private void recursion(Node node, List<Integer> result) {
		result.add(node.val);
		
		for (Node child : node.children) {
			recursion(child, result);
		}
	}

	static class Node {
		
	    public int val;
	    public List<Node> children;

	    public Node() {
	    	
	    }

	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val, List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	}
	
}
