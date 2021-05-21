package leetcode.bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode
 * 1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree
 */
public class Q1379 {

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(cloned);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            if (currentNode.val == target.val) {
                return currentNode;
            }

            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }

            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
        }

        return null;
    }

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }

    }

}
