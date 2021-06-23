package leetcode.stack;

import java.util.Stack;

/**
 * LeetCode
 * 20. Valid Parentheses
 */
public class Q20 {
    public static void main(String[] args) {
        Q20 q = new Q20();
        System.out.println(q.isValid("]"));
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
            }
        }

        return stack.isEmpty();
    }

}
