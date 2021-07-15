package leetcode.interview.tree;

/**
 * LeetCode
 * 104. Maximum Depth of Binary Tree
 * Tree
 */
public class Q104 {

    private int max = 0;

    public int maxDepth(TreeNode root) {
        recursion(root, 0);

        return max;
    }

    private void recursion(TreeNode root, int depth) {
        if (root == null) {
            max = Math.max(max, depth);
            return;
        }

        recursion(root.left, depth + 1);
        recursion(root.right, depth + 1);
    }

    public int maxDepth2(TreeNode root) {
        if (root == null) { // root가 null이면 0 리턴
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right)); // left와 right 끝까지 갔다가 돌아오면서 max 값 + 1 리턴 
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
