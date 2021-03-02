package leetcode.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q199 {
	
	private int maxLevel = 0;
	
	public static void main(String[] args) {
		Q199 q = new Q199();
		TreeNode treeNode = new TreeNode(1);
		treeNode.left = new TreeNode(2);
		treeNode.right = new TreeNode(3);
		treeNode.left.left = new TreeNode(4);
		
		System.out.println(Arrays.toString(q.rightSideView(treeNode).toArray()));
		
	}
	
	public List<Integer> rightSideView_other(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		
		if (root != null) {
			Queue<TreeNode> q = new LinkedList<>();
			q.offer(root);
			
			while (!q.isEmpty()) {
				int size = q.size();
				for (int i = 0; i < size; i++) {
					TreeNode currentNode = q.poll();
					if (i == size - 1) {
						result.add(currentNode.val);
					}
					
					if (currentNode.left != null) {
						q.offer(currentNode.left);
					}
					
					if (currentNode.right != null) {
						q.offer(currentNode.right);
					}
				}
			}
		}
		
		return result;
    }
	
	
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		addNumber(result, root, 1);
		return result;
    }

	private void addNumber(List<Integer> result, TreeNode root, int level) {
		if (root == null) {
			return;
		}
		
		if (level > maxLevel) {
			result.add(root.val);
			this.maxLevel = level;
		}
		
		addNumber(result, root.right, level + 1);
		addNumber(result, root.left, level + 1);
	}

	static public class TreeNode {
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
