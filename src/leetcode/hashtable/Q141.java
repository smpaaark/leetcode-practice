package leetcode.hashtable;

import java.util.HashSet;
import java.util.Set;

public class Q141 {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        Set<ListNode> set = new HashSet<>();
        ListNode currentNode = head;
        while (currentNode != null) {
            if (set.contains(currentNode)) {
                return true;
            }

            set.add(currentNode);
            currentNode = currentNode.next;
        }

        return false;
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
