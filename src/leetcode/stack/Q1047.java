package leetcode.stack;

import java.util.Stack;

public class Q1047 {
	
	public static void main(String[] args) {
		Q1047 q = new Q1047();
		System.out.println(q.removeDuplicates("abbaca"));
	}
	
	public String removeDuplicates(String S) {
		Stack<Character> stack = new Stack<>();
		
		for (int i = S.length() - 1; i >= 0; i--) {
			if (stack.isEmpty() || stack.peek() != S.charAt(i)) {
				stack.push(S.charAt(i));
			} else {
				stack.pop();
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		return sb.toString();
	}
	
}
