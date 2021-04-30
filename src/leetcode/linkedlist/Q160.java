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
        ListNode newHeadA = reverse(headA);
        ListNode newHeadB = reverse(headB);

        if (newHeadA.val != newHeadB.val) {
            return null;
        }

        ListNode resultNode = null;
        while (newHeadA.val == newHeadB.val) {
            newHeadA = newHeadA.next;
            newHeadB = newHeadB.next;
            resultNode = newHeadA;
        }

        return resultNode;
    }

    private ListNode reverse(ListNode head) {
        ListNode currentNode = head;
        ListNode prevNode = null;
        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }

        return prevNode;
    }

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

    }

}
