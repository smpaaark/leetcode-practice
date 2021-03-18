package leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

public class Q872 {
	
	public static void main(String[] args) {
		Q872 q = new Q872();
	
//		System.out.println(q.leafSimilar(root1, root2));
	}
	
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
        dfs(root1, list1);
        dfs(root2, list2);
        return similarCheck(list1, list2);
    }
	
	private boolean similarCheck(List<Integer> list1, List<Integer> list2) {
		if (list1.size() != list2.size()) {
			return false;
		}
		
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i) != list2.get(i)) {
				return false;
			}
		}
		
		return true;
	}

	private void dfs(TreeNode node, List<Integer> list) {
		if (node.left == null && node.right == null) {
			list.add(node.val);
			return;
		}
		
		if (node.left != null) {
			dfs(node.left, list);
		}
		
		if (node.right != null) {
			dfs(node.right, list);
		}
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
