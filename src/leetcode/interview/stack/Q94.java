package leetcode.interview.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * LeetCode
 * 94. Binary Tree Inorder Traversal
 * Stack
 */
public class Q94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root; // 현재 노드
        while (currentNode != null || !stack.isEmpty()) { // !stack.isEmpty는 오른쪽 노드가 null일 경우 stack에 남아있는 노드로 계속 진행해야 되기 때문에 조건이 있어야 한다.
            while (currentNode != null) { // 왼쪽 노드를 stack에 push 한다.
                stack.push(currentNode);
                currentNode = currentNode.left;
            }

            currentNode = stack.pop();
            list.add(currentNode.val); // stack에서 꺼내서 list에 add
            currentNode = currentNode.right; // 오른쪽 노드로 위 과정 반복
        }

        return list;
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
