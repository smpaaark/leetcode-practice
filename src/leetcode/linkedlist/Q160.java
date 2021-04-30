package leetcode.linkedlist;

/**
 * LeetCode
 * 160. Intersection of Two Linked Lists
 */
public class Q160 {

    public static void main(String[] args) {
        Q160 q = new Q160();

        ListNode headA = new ListNode(4);
        ListNode nodeA1 = new ListNode(1);
        ListNode nodeA2 = new ListNode(8);
        ListNode nodeA3 = new ListNode(4);
        ListNode nodeA4 = new ListNode(5);
        headA.next = nodeA1;
        nodeA1.next = nodeA2;
        nodeA2.next = nodeA3;
        nodeA3.next = nodeA4;

        ListNode headB = new ListNode(5);
        ListNode nodeB1 = new ListNode(6);
        ListNode nodeB2 = new ListNode(1);
        headB.next = nodeB1;
        nodeB1.next = nodeB2;
        nodeB2.next = nodeA2;

        q.getIntersectionNode(headA, headB);
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aLength = findLength(headA);
        int bLength = findLength(headB);

        if (aLength > bLength) {
            headA = changeHead(headA, aLength - bLength);
        } else {
            headB = changeHead(headB, bLength - aLength);
        }

        ListNode currentA = headA;
        ListNode currentB = headB;
        while (currentA != null && currentB != null && currentA != currentB) {
            currentA = currentA.next;
            currentB = currentB.next;
        }

        return currentA;
    }

    private ListNode changeHead(ListNode head, int moveCount) {
        ListNode currentNode = head;
        for (int i = 0; i < moveCount; i++) {
            currentNode = currentNode.next;
        }

        return currentNode;
    }

    private int findLength(ListNode head) {
        int length = 0;
        ListNode currentNode = head;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }

        return length;
    }

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

}
