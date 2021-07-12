package leetcode.interview.linkedlist;

/**
 * LeetCode
 * 141. Linked List Cycle
 * LinkedList
 */
public class Q141 {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head; // 1개씩 이동하는 노드
        ListNode fast = head; // 2개씩 이동하는 노드

        while (fast != null && fast.next != null) { // fast와 fast의 다음노드까지 null이 아닐 경우 순회
            slow = slow.next; // slow 1개 이동
            fast = fast.next.next; // fast 2개 이동

            if (slow == fast) { // slow와 fast가 같은 경우 true 리턴
                return true;
            }
        }

        return false; // while문을 빠져나오면 꼬리가 존재하는 것이므로 false 리턴
    }

    class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

    }

}
