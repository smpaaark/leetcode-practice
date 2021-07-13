package leetcode.interview.stack;

import java.util.Stack;

/**
 * LeetCode
 * 20. Valid Parentheses
 * Stack
 */
public class Q20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); // 스택 생성
        for (char c : s.toCharArray()) {
            // 여는 괄호일 경우 동일 유형의 닫는 괄호를 stack에 push 한다.
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) { // 닫는 괄호일 경우 stack이 비어있거나, 동일한 닫는 괄호가 아닐 경우 false
                return false;
            }
        }

        return stack.isEmpty(); // 여는 괄호만 존재할 경우도 있으므로 stack이 비어있으면 true, 아니면 false이다.
    }

}
