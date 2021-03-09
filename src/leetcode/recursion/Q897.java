package leetcode.recursion;

public class Q897 {
	
	public static void main(String[] args) {
		Q897 q = new Q897();
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(6);
		
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
		
		root.left.left.left = new TreeNode(1);
		
		root.right.right = new TreeNode(8);
		
		root.right.right.left = new TreeNode(7);
		root.right.right.right = new TreeNode(9);
		TreeNode result = q.increasingBST(root);
	}

//	public TreeNode increasingBST(TreeNode root) {
//		TreeNode result = new TreeNode();
//		recursion(root, result);
//		return result.right;
//    }
//	
//	private TreeNode recursion(TreeNode currentNode, TreeNode result) {
//		if (currentNode == null) {
//			return result;
//		}
//		
//		TreeNode temp = recursion(currentNode.left, result);
//		temp.right = new TreeNode(currentNode.val);
//		return recursion(currentNode.right, temp.right);
//	}
	
	public TreeNode increasingBST(TreeNode root) {
        return increasingBST(root, null);
    }

    public TreeNode increasingBST(TreeNode root, TreeNode tail) {
        if (root == null) return tail;
        TreeNode res = increasingBST(root.left, root);
        root.left = null;
        root.right = increasingBST(root.right, tail);
        return res;
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
