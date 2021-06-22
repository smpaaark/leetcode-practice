package leetcode.linkedlist;

/**
 * LeetCode
 * 203. Remove Linked List Elements
 */
public class Q203 {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode currentNode = head;
        ListNode prev = fakeHead;
        while (currentNode != null) {
            if (currentNode.val == val) {
                prev.next = currentNode.next;
            } else {
                prev = currentNode;
            }
            currentNode = currentNode.next;
        }

        return fakeHead.next;
    }

    static class ListNode {

        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }

}
