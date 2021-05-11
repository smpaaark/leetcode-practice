package leetcode.recursion;

/**
 * LeetCode
 * 783. Minimum Distance Between BST Nodes
 */
public class Q783 {

    int minDistance = Integer.MAX_VALUE;
    Integer pre = null;

    public int minDiffInBST(TreeNode root) {
        if (root.left != null) {
            minDiffInBST(root.left);
        }

        if (pre != null) {
            minDistance = Math.min(minDistance, root.val - pre);
        }

        pre = root.val;

        if (root.right != null) {
            minDiffInBST(root.right);
        }

        return minDistance;
    }

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

}
