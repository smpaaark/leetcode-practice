package leetcode.interview.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * LeetCode
 * 102. Binary Tree Level Order Traversal
 * Tree
 */
public class Q102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) { // root가 null이면 빈 배열 리턴
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>(); // 현재 level의 리스트 생성
            int size = queue.size(); // 현재까지의 큐 size를 담는다.
            while (size-- > 0) { // 큐사이즈 만큼이 한 level이다.
                TreeNode node = queue.poll();
                list.add(node.val);

                // 현재 poll한 노드의 좌우 노드가 존재하면 queue에 넣는다.
                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(list); // size만큼 담은 list를 결과에 추가한다.
        }

        return result;
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
