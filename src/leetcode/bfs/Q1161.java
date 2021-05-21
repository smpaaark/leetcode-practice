package leetcode.bfs;

import java.util.*;

/**
 * LeetCode
 * 1161. Maximum Level Sum of a Binary Tree
 */
public class Q1161 {

    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int level = 1;
        int maxLevel = 0;
        int max = Integer.MIN_VALUE;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int tempSum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                tempSum += node.val;

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            if (tempSum > max) {
                max = tempSum;
                maxLevel = level;
            }
            level++;
        }

        return maxLevel;
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
