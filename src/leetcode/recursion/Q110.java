package leetcode.recursion;

/**
 * LeetCode
 * 110. Balanced Binary Tree
 */
public class Q110 {

    public static void main(String[] args) {
        Q110 q = new Q110();
        //[1, 2,2, 3,null, null,3 ,4,null ,null,4]
        TreeNode root1 = new TreeNode(1);

        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(2);

        TreeNode root4 = new TreeNode(3);
        TreeNode root5 = new TreeNode(3);

        TreeNode root6 = new TreeNode(4);
        TreeNode root7 = new TreeNode(4);

        root1.left = root2;
        root1.right = root3;

        root2.left = root4;

        root4.left = root6;
        root4.right = root7;

        System.out.println(q.isBalanced(root1));

    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        return recursion(root, 0) == -1 ? false : true;
    }

    private int recursion(TreeNode node, int height) {
        if (node == null || height == -1) {
            return height;
        }

        int leftHeight = recursion(node.left, height + 1);
        int rightHeight = recursion(node.right, height + 1);

        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight);
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
