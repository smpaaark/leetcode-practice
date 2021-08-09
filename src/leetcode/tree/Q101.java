package leetcode.tree;

import java.util.Stack;

public class Q101 {

    public boolean isSymmetric(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);

        while (!stack.isEmpty()) {
            TreeNode left = stack.pop();
            TreeNode right = stack.pop();
            if (!(left == null && right == null)) {
                if (left == null || right == null) {
                    return false;
                } else if (left.val != right.val) {
                    return false;
                } else {
                    stack.push(left.left);
                    stack.push(right.right);

                    stack.push(left.right);
                    stack.push(right.left);
                }
            }
        }

        return true;
    }

//    public boolean isSymmetric(TreeNode root) {
//        return recursion(root.left, root.right);
//    }
//
//    private boolean recursion(TreeNode left, TreeNode right) {
//        if (left == null && right == null) {
//            return true;
//        }
//
//        if (left == null || right == null) {
//            return false;
//        }
//
//        if (left.val != right.val) {
//            return false;
//        }
//
//        return recursion(left.left, right.right) && recursion(left.right, right.left);
//    }

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
