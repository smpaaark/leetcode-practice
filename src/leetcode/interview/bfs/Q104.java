package leetcode.interview.bfs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * LeetCode
 * 104. Maximum Depth of Binary Tree
 * BFS
 */
public class Q104 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int maxDepth = 0;
        while (!queue.isEmpty()) {
            int qSize = queue.size();
            while (qSize-- > 0) { // 현재까지 queue에 들어있는 node들의 depth는 모두 같다.
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            maxDepth++; // depth를 1 증가시킨다.
        }

        return maxDepth;
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
