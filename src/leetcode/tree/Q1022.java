package leetcode.tree;

/**
 * LeetCode
 * 1022. Sum of Root To Leaf Binary Numbers
 */
public class Q1022 {

    private int result = 0;

    public static void main(String[] args) {

    }

    public int sumRootToLeaf(TreeNode root) {
        dfs(root, String.valueOf(root.val));

        return result;
    }

    private void dfs(TreeNode root, String bitString) {
        if (root.left == null && root.right == null) {
            result += Integer.parseInt(bitString, 2);
            return;
        }

        if (root.left != null) {
            dfs(root.left, bitString + root.left.val);
        }

        if (root.right != null) {
            dfs(root.right, bitString + root.right.val);
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
