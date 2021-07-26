package leetcode.interview.bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode
 * 101. Symmetric Tree
 * BFS
 */
public class Q101 {

    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);

        while (!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            if ((left == null && right != null) || (left != null && right == null)) {
                return false;
            }

            if (left != null && right != null) {
                if (left.val != right.val) {
                    return false;
                }

                queue.offer(left.left);
                queue.offer(right.right);
                queue.offer(left.right);
                queue.offer(right.left);
            }
        }

        return true;
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
