package leetcode.interview.stack;

import java.util.Stack;

/**
 * LeetCode
 * 234. Palindrome Linked List
 */
public class Q234 {

    public boolean isPalindrome(ListNode head) {
        // stack에 순차적으로 push 한다.
        ListNode tempNode = head;
        Stack<ListNode> stack = new Stack<>();
        while (tempNode != null) {
            stack.push(tempNode);
            tempNode = tempNode.next;
        }

        // stack에서 빼면서 현재 값과 비교한다.
        while (head != null) {
            if (stack.pop().val != head.val) {
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
