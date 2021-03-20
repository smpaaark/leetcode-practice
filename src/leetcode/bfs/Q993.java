package leetcode.bfs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Q993 {
	
	// 시간 복잡도: n
	// 공간 복잡도: n
	public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>(); // 공간 n
        Map<Integer, Integer> map = new HashMap<>(); // 공간 n
        q.offer(root);
        map.put(root.val, 0);
        
        while (!q.isEmpty()) { // 시간 n
        	TreeNode currentNode = q.poll();
        	if (currentNode.left != null && currentNode.right != null) {
        		if ((currentNode.left.val == x && currentNode.right.val == y) || (currentNode.left.val == y && currentNode.right.val == x)) {
        			return false;
        		}
        	}
        	
        	if (currentNode.left != null) {
        		q.offer(currentNode.left);
        		map.put(currentNode.left.val, map.get(currentNode.val) + 1);
        	}
        	
        	if (currentNode.right != null) {
        		q.offer(currentNode.right);
        		map.put(currentNode.right.val, map.get(currentNode.val) + 1);
        	}
        }
        
        if (map.get(x) == map.get(y)) {
        	return true;
        }
        
        return false;
    }
	
	public class TreeNode {
		
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
