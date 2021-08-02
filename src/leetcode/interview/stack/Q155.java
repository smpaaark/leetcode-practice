package leetcode.interview.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * LeetCode
 * 155. Min Stack
 * Stack
 */
public class Q155 {

    class MinStack {

        Node head;

        public MinStack() {

        }

        public void push(int val) { // 해당 노드의 min값은 항상 그 노드 기준의 min 값을 갖는다.
            if (head == null) {
                head = new Node(val, val);
            } else {
                Node newHead = new Node(val, Math.min(val, head.min), head);
                head = newHead;
            }
        }

        public void pop() {
            head = head.next;
        }

        public int top() {
            return head.val;
        }

        public int getMin() {
            return head.min;
        }

    }

    class Node {

        int val;
        int min;
        Node next;

        public Node(int val, int min) {
            this.val = val;
            this.min = min;
        }

        public Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }

    }

}
