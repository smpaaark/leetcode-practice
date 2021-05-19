package leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode
 * 257. Binary Tree Paths
 */
public class Q257 {

    private List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root, root.val + "");
        return result;
    }

    private void dfs(TreeNode root, String str) {
        if (root.left == null && root.right == null) {
            result.add(str);

            return;
        }

        if (root.left != null) {
            dfs(root.left, str + "->" + root.left.val);
        }

        if (root.right != null) {
            dfs(root.right, str + "->" + root.right.val);
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
