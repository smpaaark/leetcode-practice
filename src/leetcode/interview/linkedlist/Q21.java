package leetcode.interview.linkedlist;

/**
 * LeetCode
 * 21. Merge Two Sorted Lists
 * LinkedList
 */
public class Q21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) { // l1 == null이면 l2 리턴
            return l2;
        }

        if (l2 == null) { // l2 == null이면 l1 리턴
            return l1;
        }

        if(l1.val < l2.val){ // l1보다 l2가 크면 l1.next와 l2 비교
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else{ // l1이 l2보다 크거나 같으면 l2.next와 l1 비교
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    class ListNode {

        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }

}
