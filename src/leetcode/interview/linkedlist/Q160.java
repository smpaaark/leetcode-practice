package leetcode.interview.linkedlist;

/**
 * LeetCode
 * 160. Intersection of Two Linked Lists
 * Linked List
 */
public class Q160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 둘 중 하나라도 null이면 null 리턴
        if(headA == null || headB == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;

        // a와 b가 다르면 반복
        while( a != b){

            // null이면 상대 헤드값으로 새로 세팅한다.
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }

        // a와 b의 길이가 같을 경우에는 교차노드 또는 null이 바로 리턴된다.
        // 길이가 다를 경우 위 반복문 내의 과정을 반복하다보면 교차 노드가 생기거나 null로 끝난다.
        return a;
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
