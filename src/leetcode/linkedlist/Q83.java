package leetcode.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode
 * 83. Remove Duplicates from Sorted List
 */
public class Q83 {

    public static void main(String[] args) {
        Q83 q = new Q83();
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);

        head.next = node1;
        node1.next = node2;

        q.deleteDuplicates(head);
    }

    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<>();
        ListNode currentNode = head;
        ListNode prevNode = null;
        while (currentNode != null) {
            if (set.contains(currentNode.val)) {
                prevNode.next = currentNode.next;
            } else {
                set.add(currentNode.val);
                prevNode = currentNode;
            }

            currentNode = currentNode.next;
        }

        return head;
    }

    static class ListNode {

        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }

}
