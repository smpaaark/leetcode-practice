package leetcode.dfs;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode
 * 235. Lowest Common Ancestor of a Binary Search Tree
 */
public class Q235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val && root.left != null) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val && root.right != null) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }

    class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }

    }

}
