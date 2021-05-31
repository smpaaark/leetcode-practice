package leetcode.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode
 * 94. Binary Tree Inorder Traversal
 */
public class Q94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        dfs(root, resultList);

        return resultList;
    }

    private void dfs(TreeNode root, List<Integer> resultList) {
        if (root == null) {
            return;
        }

        dfs(root.left, resultList);
        resultList.add(root.val);
        dfs(root.right, resultList);
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
