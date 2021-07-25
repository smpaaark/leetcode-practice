package leetcode.interview.dfs;

/**
 * LeetCode
 * 101. Symmetric Tree
 * DFS
 */
public class Q101 {

    public boolean isSymmetric(TreeNode root) {
        return dfs(root.left, root.right);
    }

    private boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null) { // 둘다 null이면 true
            return true;
        }

        if ((left == null && right != null) || (left != null && right == null)) { // 한쪽만 null이면 false
            return false;
        }

        if (left.val != right.val) { // 둘다 null이 아니지만 val이 다르면 false
            return false;
        }

        return dfs(left.left, right.right) && dfs(left.right, right.left); // 자식 노드 dfs 호출
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
