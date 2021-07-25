package leetcode.interview.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode
 * 94. Binary Tree Inorder Traversal
 * DFS
 */
public class Q94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        dfs(root, resultList);

        return resultList;
    }

    private void dfs(TreeNode root, List<Integer> resultList) { // dfs 로직
        if (root != null) {
            if (root.left != null) {
                dfs(root.left, resultList); // 왼쪽 노드 먼저 재귀
            }

            resultList.add(root.val); // 현재 노드 추가
            
            if (root.right != null) {
                dfs(root.right, resultList); // 오른쪽 노드 재귀
            }
        }
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
