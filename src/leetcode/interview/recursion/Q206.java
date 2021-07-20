package leetcode.interview.recursion;

/**
 * LeetCode
 * 206. Reverse Linked List
 * Recursion
 */
public class Q206 {

    public ListNode reverseList(ListNode head) {
        return recursion(head, null);
    }

    private ListNode recursion(ListNode node, ListNode prevNode) {
        if (node == null) { // node가 null이면 prevNode가 새로운 head가 되어 리턴된다.
            return prevNode;
        }

        ListNode next = node.next; // 다음 노드를 임시로 저장해둔다.
        node.next = prevNode; // 현재 노드의 다음 노드를 이전 노드를 가리키게 한다.
        return recursion(next, node); // next 노드(현재 노드가 됨)와 현재노드(이전 노드가 됨)를 전달하여 함수를 호출한다.
    }

    class ListNode {

        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }

}
