package leetcode.dfs;

/**
 * LeetCode
 * 404. Sum of Left Leaves
 */
public class Q404 {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftValue = 0;
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                leftValue += root.left.val;
            } else {
                leftValue += sumOfLeftLeaves(root.left);
            }
        }

        leftValue += sumOfLeftLeaves(root.right);

        return leftValue;
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
