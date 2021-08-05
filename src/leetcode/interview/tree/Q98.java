package leetcode.interview.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode
 * 98. Validate Binary Search Tree
 * Tree
 */
public class Q98 {

    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }

        if (root.val >= max || root.val <= min) {
            return false;
        }

        // 왼쪽 노드의 max는 현재 값이 되고, 오른쪽 노드의 min은 현재 값이 된다.
        return validate(root.left, min, root.val) && validate(root.right, root.val, max);
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
