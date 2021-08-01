package leetcode.interview.linkedlist;

/**
 * LeetCode
 * 206. Reverse Linked List
 * Linked List
 */
public class Q206 {

    public ListNode reverseList(ListNode head) {
        ListNode prevNode = null; // 이전 노드
        while (head != null) {
            ListNode nextNode = head.next; // 기존 next 노드 임시로 저장
            head.next = prevNode; // next를 이전 노드로 변경
            prevNode = head; // 이전 노드를 현재노드로 변경
            head = nextNode; // 현재 노드를 임시로 저장했던 nextNode로 변경
        }

        return prevNode;
    }

    class ListNode {

        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }

}
