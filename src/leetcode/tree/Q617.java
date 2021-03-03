package leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Q617 {
	
	public static void main(String[] args) {
		Q617 q = new Q617();
		
//		TreeNode root1 = new TreeNode(1);
//		root1.left = new TreeNode(3);
//		root1.right = new TreeNode(2);
//		
//		root1.left.left = new TreeNode(5);
//		
//		TreeNode root2 = new TreeNode(2);
//		root2.left = new TreeNode(1);
//		root2.right = new TreeNode(3);
//		
//		root2.left.right = new TreeNode(4);
//		
//		root2.right.right = new TreeNode(7);
		
		TreeNode root1 = null;
		TreeNode root2 = new TreeNode(1);
		
		TreeNode newTreeNode = q.mergeTrees_other(root1, root2);
		print(newTreeNode);
	}
	
	private TreeNode mergeTrees_other(TreeNode root1, TreeNode root2) {
		if (root1 == null) {
			return root2;
		}
		
		if (root2 == null) {
			return root1;
		}
		
		root1.val += root2.val;
		
		root1.left = mergeTrees_other(root1.left, root2.left);
		root1.right = mergeTrees_other(root1.right, root2.right);
		
		return root1;
	}

	private static void print(TreeNode newTreeNode) {
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(newTreeNode);
		
		while (!q.isEmpty()) {
			TreeNode currentTreeNode = q.poll();
			System.out.print(currentTreeNode.val + " ");
			
			if (currentTreeNode.left != null) {
				q.offer(currentTreeNode.left);
			}
			
			if (currentTreeNode.right != null) {
				q.offer(currentTreeNode.right);
			}
		}
	}

	public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
			return null;
		}
		
        Queue<TreeNode> root1Q = new LinkedList<>();
        Queue<TreeNode> root2Q = new LinkedList<>();
        
        root1 = root1 != null ? root1 : new TreeNode();
        root1Q.offer(root1);
        root2Q.offer(root2 != null ? root2 : new TreeNode());
        
        while (!root1Q.isEmpty()) {
        	TreeNode currentNode1 = root1Q.poll();
        	TreeNode currentNode2 = root2Q.poll();
        	currentNode1.val += currentNode2.val;
        	
        	if (currentNode1.left != null && currentNode2.left != null) {
        		root1Q.offer(currentNode1.left);
        		root2Q.offer(currentNode2.left);
        	} else if (currentNode1.left != null && currentNode2.left == null) {
        		currentNode2.left = new TreeNode();
        		root1Q.offer(currentNode1.left);
        		root2Q.offer(currentNode2.left);
        	} else if (currentNode1.left == null && currentNode2.left != null) {
        		currentNode1.left = new TreeNode();
        		root1Q.offer(currentNode1.left);
        		root2Q.offer(currentNode2.left);
        	}
        	
        	if (currentNode1.right != null && currentNode2.right != null) {
        		root1Q.offer(currentNode1.right);
        		root2Q.offer(currentNode2.right);
        	} else if (currentNode1.right != null && currentNode2.right == null) {
        		currentNode2.right = new TreeNode();
        		root1Q.offer(currentNode1.right);
        		root2Q.offer(currentNode2.right);
        	} else if (currentNode1.right == null && currentNode2.right != null) {
        		currentNode1.right = new TreeNode();
        		root1Q.offer(currentNode1.right);
        		root2Q.offer(currentNode2.right);
        	}
        }
        
        return root1;
    }
	
	static class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    
	    TreeNode() {}
	    
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
