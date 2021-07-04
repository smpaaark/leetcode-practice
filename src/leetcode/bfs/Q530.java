package leetcode.bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode
 * 530. Minimum Absolute Difference in BST
 */
public class Q530 {

    private int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.left != null) {
                queue.offer(node.left);
                TreeNode leftMaxNode = node.left;
                while (leftMaxNode.right != null) {
                    leftMaxNode = leftMaxNode.right;
                }
                min = Math.min(min, node.val - leftMaxNode.val);
            }

            if (node.right != null) {
                queue.offer(node.right);
                TreeNode rightMinNode = node.right;
                while (rightMinNode.left != null) {
                    rightMinNode = rightMinNode.left;
                }
                min = Math.min(min, rightMinNode.val - node.val);
            }
        }

        return min;
    }

    class TreeNode {

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
