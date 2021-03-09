package leetcode.recursion;

public class Q104 {
	
	private int maxDepth = 0;
	
	public static void main(String[] args) {
		Q104 q = new Q104();
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		System.out.println(q.maxDepth(root));
	}
	
	public int maxDepth(TreeNode root) {
        recursion(root, 1);
        
        return this.maxDepth;
    }
	
	private void recursion(TreeNode root, int currentDepth) {
		if (root == null) {
			return;
		}
		
		if (currentDepth > this.maxDepth) {
			this.maxDepth = currentDepth;
		}
		
		recursion(root.left, currentDepth + 1);
		recursion(root.right, currentDepth + 1);
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
