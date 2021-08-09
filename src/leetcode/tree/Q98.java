package leetcode.tree;

public class Q98 {

    public boolean isValidBST(TreeNode root) {
        return recursion(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean recursion(TreeNode root, long minValue, long maxValue) {
        if (root == null) {
            return true;
        }

        if (root.val <= minValue || root.val >= maxValue) {
            return false;
        }

        return recursion(root.left, minValue, root.val) && recursion(root.right, root.val, maxValue);
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
