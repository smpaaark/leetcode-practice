package leetcode.tree;

/**
 * LeetCode
 * 543. Diameter of Binary Tree
 */
public class Q543 {

    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);

        return max;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = dfs(root.left);
        int right = dfs(root.right);

        max = Math.max(max, left + right);

        return Math.max(left, right) + 1;
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
