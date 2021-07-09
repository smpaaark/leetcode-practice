package leetcode.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * LeetCode
 * 155. Min Stack
 */
public class Q155 {

    class MinStack {

        private Stack<Integer> stack;
        private PriorityQueue<Integer> queue;

        /** initialize your data structure here. */
        public MinStack() {
            stack = new Stack<>();
            queue = new PriorityQueue<>();
        }

        public void push(int val) {
            queue.offer(val);
            stack.push(val);
        }

        public void pop() {
            int popNum = stack.pop();
            List<Integer> list = new ArrayList<>();
            while (!queue.isEmpty()) {
                Integer pollNum = queue.poll();
                if (pollNum == popNum) {
                    break;
                }

                list.add(pollNum);
            }

            for (Integer num : list) {
                queue.offer(num);
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return queue.peek();
        }

    }

}
