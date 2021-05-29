package leetcode.linkedlist;

/**
 * LeetCode
 * 234. Palindrome Linked List
 */
public class Q234 {

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        } else if (head.next == null) {
            return true;
        }

        ListNode currentNode = head;

        int size = 0;
        while (currentNode != null) {
            size++;
            currentNode = currentNode.next;
        }

        ListNode currentNode1 = head;
        ListNode currentNode2 = null;
        ListNode prev= null;
        int halfSize = size / 2;
        while (currentNode1 != null && halfSize-- > 0) {
            ListNode nextNode = currentNode1.next;
            currentNode1.next = prev;
            prev = currentNode1;
            currentNode1 = nextNode;
            currentNode2 = nextNode;
        }

        if (size % 2 > 0) {
            currentNode2 = currentNode2.next;
        }
        currentNode1 = prev;

        while (currentNode1 != null && currentNode2 != null) {
            if (currentNode1.val != currentNode2.val) {
                return false;
            }

            currentNode1 = currentNode1.next;
            currentNode2 = currentNode2.next;
        }

        return true;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
