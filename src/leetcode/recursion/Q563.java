package leetcode.recursion;

/**
 * LeetCode
 * 563. Binary Tree Tilt
 */
public class Q563 {

    int result = 0;

    public int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }

        recursion(root);

        return result;
    }

    private int recursion(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = recursion(root.left);
        int right = recursion(root.right);

        result += Math.abs(right - left);

        return root.val + left + right;
    }

    public class TreeNode {

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
