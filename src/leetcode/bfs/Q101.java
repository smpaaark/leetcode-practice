package leetcode.bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode
 * 101. Symmetric Tree
 * 시간 복잡도: O(n)
 * 공간 복잡도: O(n)
 */
public class Q101 {
	
	public static void main(String[] args) {
		Q101 q = new Q101();
		
		TreeNode head = new TreeNode(1);
		head.left = new TreeNode(2);
		head.right = new TreeNode(2);
		
		head.left.right = new TreeNode(3);
		head.right.right = new TreeNode(3);
		
		
		System.out.println(q.isSymmetric(head));
	}
	
	public boolean isSymmetric(TreeNode root) {
		if (root.left == null && root.right == null) {
			return true;
		}
		
		Queue<TreeNode> leftQueue = new LinkedList<>();
		Queue<TreeNode> rightQueue = new LinkedList<>();
		leftQueue.offer(root.left);
		rightQueue.offer(root.right);
		
		while (!leftQueue.isEmpty() && !rightQueue.isEmpty()) {
			TreeNode leftNode = leftQueue.poll();
			TreeNode rightNode = rightQueue.poll();
			
			if (leftNode == null && rightNode == null) {
				continue;
			}
			
			if (leftNode == null || rightNode == null) {
				return false;
			}
			
			if (leftNode.val != rightNode.val) {
				return false;
			}
			
			leftQueue.offer(leftNode.left);
			leftQueue.offer(leftNode.right);
			rightQueue.offer(rightNode.right);
			rightQueue.offer(rightNode.left);
		}
		
		return true;
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
