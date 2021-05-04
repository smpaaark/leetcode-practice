package leetcode.tree;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode
 * 700. Search in a Binary Search Tree
 */
public class Q700 {

    public TreeNode searchBST(TreeNode root, int val) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            if (currentNode.val == val) {
                return currentNode;
            }

            if (currentNode.left != null && currentNode.val > val) {
                queue.offer(currentNode.left);
            }

            if (currentNode.right != null && currentNode.val < val) {
                queue.offer(currentNode.right);
            }
        }

        return null;
    }

    public class TreeNode {

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
