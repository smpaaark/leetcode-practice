package leetcode.queue;

import java.util.Stack;

/**
 * LeetCode
 * 232. Implement Queue using Stacks
 */
public class Q232 {

    class MyQueue {

        Stack<Integer> realStack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();

        /** Initialize your data structure here. */
        public MyQueue() {

        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            if (empty()) {
                realStack.push(x);
            } else {
                while (!empty()) {
                    tempStack.push(realStack.pop());
                }

                realStack.push(x);

                while (!tempStack.isEmpty()) {
                    realStack.push(tempStack.pop());
                }
            }
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            return realStack.pop();
        }

        /** Get the front element. */
        public int peek() {
            return realStack.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return realStack.isEmpty();
        }

    }

}
