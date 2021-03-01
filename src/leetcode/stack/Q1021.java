package leetcode.stack;

import java.util.Stack;

public class Q1021 {
	
	public static void main(String[] args) {
		Q1021 q = new Q1021();
		System.out.println(q.removeOuterParentheses("(()())(())"));
		System.out.println(q.removeOuterParentheses("(()())(())(()(()))"));
		System.out.println(q.removeOuterParentheses("()()"));
	}
	
	public String removeOuterParentheses(String S) {
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (stack.isEmpty()) {
				stack.push(c);
			} else if (c == '(') {
				sb.append(c);
				stack.push(c);
			} else if (c == ')' && stack.size() > 1) {
				sb.append(c);
				stack.pop();
			} else {
				stack.pop();
			}
		}
		
		return sb.toString();
	}
	
}
