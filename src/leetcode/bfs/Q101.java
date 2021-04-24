package leetcode.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 101. Symmetric Tree
 * 
 * 
 * 
 * 
 */
public class Q101 {
	
	public boolean isSymmetric(TreeNode root) {
		if (root.left == null && root.right == null) {
			return true;
		}
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		
		int level = 1;
		while (!queue.isEmpty()) {
			TreeNode currentNode = queue.poll();
			
			queue.offer(currentNode.left);
			queue.offer(currentNode.right);
		}
		
    }
	
	static class TreeNode {
		
	    int val;
	    TreeNode left;
	    TreeNode right;
	    
	    TreeNode() {}
	    
	    TreeNode(int val) { this.val = val; }
	    
	    TreeNode(int val, TreeNode left, TreeNode right) {
	        this.val = val;
	        this.left = left;
	        this.right = right;
	    }
	    
	}
	
}
