package leetcode.bfs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * LeetCode
 * 111. Minimum Depth of Binary Tree
 * 시간 복잡도: O(n)
 * 공간 복잡도: O(n)
 */
public class Q111 {
	
	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		
        Queue<TreeNode> queue = new LinkedList<>();
        Map<TreeNode, Integer> map = new HashMap<>();
        queue.offer(root);
        map.put(root, 1);
        while (!queue.isEmpty()) {
        	TreeNode node = queue.poll();
        	int depth = map.get(node);
        	
        	if (node.left == null && node.right == null) {
        		return depth;
        	}
        	
        	if (node.left != null) {
        		queue.offer(node.left);
        		map.put(node.left, depth + 1);
        	}
        	
        	if (node.right != null) {
        		queue.offer(node.right);
        		map.put(node.right, depth + 1);
        	}
        	
        }
        
        return 0;
    }
	
	public class TreeNode {
		
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
