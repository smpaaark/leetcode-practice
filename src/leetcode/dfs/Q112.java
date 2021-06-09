package leetcode.dfs;

/**
 * LeetCode
 * 112. Path Sum
 */
public class Q112 {

    private boolean result = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        dfs(root, targetSum, 0);

        return result;
    }

    private void dfs(TreeNode root, int targetSum, int sum) {
        if (result) {
            return;
        }

        if ((root.left == null && root.right == null)) {
            if (targetSum == (sum + root.val)) {
                result = true;
            }

            return;
        }
        if(root.left != null) {
            dfs(root.left, targetSum, sum + root.val);
        }

        if(root.right != null) {
            dfs(root.right, targetSum, sum + root.val);
        }
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
