package leetcode.dfs;

/**
 * LeetCode
 * 100. Same Tree
 */
public class Q100 {

    private boolean result = true;

    public boolean isSameTree(TreeNode p, TreeNode q) {
        dfs(p, q);

        return result;
    }

    private void dfs(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return;
        }

        if (p == null && q != null) {
            result = false;
            return;
        }

        if (p != null && q == null) {
            result = false;
            return;
        }

        if (p.val != q.val) {
            result = false;
            return;
        }

        dfs(p.left, q.left);
        dfs(p.right, q.right);
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
