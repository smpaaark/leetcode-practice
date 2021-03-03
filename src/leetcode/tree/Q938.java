package leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Q938 {
	
	public static void main(String[] args) {
		Q938 q = new Q938();
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);
		
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(7);
		
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(18);
		
		root.left.left.left = new TreeNode(1);
		
		root.left.right.left = new TreeNode(6);
		
		System.out.println(q.rangeSumBST_other(root, 6, 10));
	}
	
	public int rangeSumBST(TreeNode root, int low, int high) {
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		
		int sum = 0;
		while (!q.isEmpty()) {
			TreeNode currentNode = q.poll();
			if (rangeCheck(currentNode.val, low, high)) {
				sum += currentNode.val;
			}
			
			if (currentNode.left != null) {
				q.offer(currentNode.left);
			}
			
			if (currentNode.right != null) {
				q.offer(currentNode.right);
			}
		}
		
		return sum;
	}
	
	public int rangeSumBST_other(TreeNode root, int low, int high) {
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		
		int sum = 0;
		while (!q.isEmpty()) {
			TreeNode currentNode = q.poll();
			if (currentNode != null) {
				if (rangeCheck(currentNode.val, low, high)) {
					sum += currentNode.val;
				}
				
				if (low < currentNode.val) {
					q.offer(currentNode.left);
				}
				
				if (currentNode.val < high) {
					q.offer(currentNode.right);
				}
			}
		}
		
		return sum;
	}
	
	private boolean rangeCheck(int currentVal, int low, int high) {
		if (currentVal >= low && currentVal <= high) {
			return true;
		}
		
		return false;
	}

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode() {
			
		}
		
		TreeNode(int val) {
			this.val = val;
		}
		
		TreeNode(int val, TreeNode left, TreeNode right) {
		    this.val = val;
		    this.left = left;
		    this.right = right;
		}
		
	}
}
