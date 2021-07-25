package leetcode.repeat;

import java.util.Stack;

/**
 * LeetCode
 * 101. Symmetric Tree
 */
public class Q101 {

    public boolean isSymmetric(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);

        while (!stack.isEmpty()) {
            TreeNode left = stack.pop();
            TreeNode right = stack.pop();

            if ((left == null && right != null) || (left != null && right == null)) {
                return false;
            }

            if (left != null && right != null) {
                if (left.val != right.val) {
                    return false;
                }

                stack.push(left.left);
                stack.push(right.right);

                stack.push(left.right);
                stack.push(right.left);
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
