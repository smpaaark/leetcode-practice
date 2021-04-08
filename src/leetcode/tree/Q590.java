package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class Q590 {
	
	public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
        	recursion(root, result);
        }
        
        return result;
    }
	
	private void recursion(Node node, List<Integer> result) {
		if (node.children == null) {
			result.add(node.val);
			
			return;
		}
		
		for (Node child : node.children) {
        	recursion(child, result);
        }
		
		result.add(node.val);
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
