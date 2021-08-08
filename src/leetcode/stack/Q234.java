package leetcode.stack;

import java.util.Stack;

public class Q234 {

    public boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }

        ListNode currentNode = head;
        Stack<Integer> stack = new Stack<>();
        while (currentNode != null) {
            stack.push(currentNode.val);
            currentNode = currentNode.next;
        }

        while (!stack.isEmpty()) {
            if (head.val != stack.pop()) {
                return false;
            }

            head = head.next;
        }

        return true;
    }

    class ListNode {

        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }

}
