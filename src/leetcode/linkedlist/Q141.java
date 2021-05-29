package leetcode.linkedlist;

/**
 * LeetCode
 * 141. Linked List Cycle
 */
public class Q141 {

    public boolean hasCycle(ListNode head) {
        ListNode step1 = head;
        ListNode step2 = head;

        while (step1 != null && step2 != null) {
            step1 = step1.next;
            if (step2.next != null) {
                step2 = step2.next.next;
            } else {
                return false;
            }

            if (step1 == step2) {
                return true;
            }
        }

        return false;
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
