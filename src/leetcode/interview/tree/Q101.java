package leetcode.interview.tree;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * LeetCode
 * 101. Symmetric Tree
 * Tree
 */
public class Q101 {

    public boolean isSymmetric(TreeNode root) {
        if (root.left == null && root.right == null) {
            return true;
        }

        Queue<TreeNode> leftQueue = new LinkedList<>();
        Queue<TreeNode> rightQueue = new LinkedList<>();
        leftQueue.offer(root.left);
        rightQueue.offer(root.right);

        while (!leftQueue.isEmpty() && !rightQueue.isEmpty()) {
            TreeNode left = leftQueue.poll();
            TreeNode right = rightQueue.poll();

            if ((left == null && right != null) || (left != null && right == null)) {
                return false;
            } else if (left != null && right != null) {
                if (left.val != right.val) {
                    return false;
                }

                leftQueue.offer(left.left);
                leftQueue.offer(left.right);

                rightQueue.offer(right.right);
                rightQueue.offer(right.left);
            }
        }

        return leftQueue.isEmpty() && rightQueue.isEmpty();
    }

    public boolean isSymmetric2(TreeNode root) {
        if (root.left == null && root.right == null) { // 노드가 1개이면 true 리턴
            return true;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);

        while (!stack.isEmpty()) {
            TreeNode right = stack.pop();
            TreeNode left = stack.pop();

            if ((left == null && right != null) || (left != null && right == null)) { // 한쪽만 null이면 false
                return false;
            } else if (left != null && right != null) { // 둘다 null이면 바로 다음 stack 반복
                if (left.val != right.val) { // 둘다 null이 아니면 값 비교
                    return false;
                }

                // left의 left, right의 right를 push (대칭)
                stack.push(left.left);
                stack.push(right.right);

                // left의 right, right의 left를 push (대칭)
                stack.push(left.right);
                stack.push(right.left);
            }
        }

        return true;
    }

    public boolean isSymmetric3(TreeNode root) {
        return recursion(root.left, root.right); // 재귀 호출
    }

    private boolean recursion(TreeNode left, TreeNode right) {
        if ((left == null && right != null) || (left != null && right == null)) { // 둘 중 하나만 null이면 false
            return false;
        }

        if (left == null && right == null) { // 둘다 null이면 true
            return true;
        }

        if (left.val == right.val) { // 둘의 값이 같으면 left의 left와 right의 right 재귀호출 && left의 right와 right의 left 재귀 호출 (대칭)
            return recursion(left.left, right.right) && recursion(left.right, right.left);
        }

        return false; // 둘의 값이 다르면 false
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
