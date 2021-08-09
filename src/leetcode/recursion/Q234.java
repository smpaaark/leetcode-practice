package leetcode.recursion;

public class Q234 {

    ListNode node;

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        if (node == null) {
            node = head;
        }

        boolean result = isPalindrome(head.next);
        if (node.val == head.val) {
            node = node.next;
        } else {
            result = false;
        }

        return result;
    }

    class ListNode {

        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }

}
