package leetcode.recursion;

public class Q206 {

    public ListNode reverseList(ListNode head) {
        return recursion(head, null);
    }

    private ListNode recursion(ListNode node, ListNode prev) {
        if (node == null) {
            return prev;
        }

        ListNode next = node.next;
        node.next = prev;
        return recursion(next, node);
    }

    class ListNode {

        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }

}
