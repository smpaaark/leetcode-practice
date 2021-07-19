package leetcode.interview.hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode
 * 141. Linked List Cycle
 * HashTable
 */
public class Q141 {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            if (set.contains(current)) { // set에 있으면 cycle이므로 true 리턴
                return true;
            }

            set.add(current); // 없으면 set에 추가
            current = current.next;
        }

        return false; // 다 돌때 까지 true가 아니기 때문에 false 리턴
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
