package leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode
 * 965. Univalued Binary Tree
 */
public class Q965 {

    public boolean isUnivalTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            int val = root.val;

            if (node.left != null) {
                if (node.left.val != val) {
                    return false;
                }

                queue.offer(node.left);
            }

            if (node.right != null) {
                if (node.right.val != val) {
                    return false;
                }

                queue.offer(node.right);
            }
        }

        return true;
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
