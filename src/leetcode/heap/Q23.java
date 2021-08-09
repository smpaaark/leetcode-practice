package leetcode.heap;

import java.util.Arrays;
import java.util.Objects;
import java.util.PriorityQueue;

public class Q23 {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> {
            return a.val - b.val;
        });

        Arrays.stream(lists).filter(Objects::nonNull).forEach(queue::offer);

        ListNode fakeHead = new ListNode();
        ListNode currentNode = fakeHead;
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            currentNode.next = node;
            currentNode = currentNode.next;
            if (node.next != null) {
                queue.offer(node.next);
            }
        }

        return fakeHead.next;
    }

    class ListNode {

        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }

}
