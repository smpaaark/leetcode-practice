package leetcode.interview.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * LeetCode
 * 23. Merge k Sorted Lists
 * Heap
 */
public class Q23 {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> {
            return a.val - b.val;
        });

        for (ListNode node : lists) { // null이 아닌 ListNode만 heap에 추가한다.
            if (node != null) {
                heap.offer(node);
            }
        }

        ListNode fakeHead = new ListNode();
        ListNode currentNode = fakeHead;
        while (!heap.isEmpty()) {
            ListNode node = heap.poll();
            currentNode.next = node;
            if (node.next != null) { // 현재 poll한 노드의 next를 heap에 넣어준다.
                heap.offer(node.next);
            }
            currentNode = currentNode.next;
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
