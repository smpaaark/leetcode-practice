package leetcode.stack;

import java.util.Stack;

public class Q682 {
	
	public static void main(String[] args) {
		Q682 q = new Q682();
		System.out.println(q.calPoints(new String[] {"5","2","C","D","+"}));
		System.out.println(q.calPoints(new String[] {"5","-2","4","C","D","9","+","+"}));
		System.out.println(q.calPoints(new String[] {"1"}));
	}
	
	public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
        	if ("+".equals(op)) {
        		int sumNum = 0;
        		int[] temp = new int[2];
        		for (int i = 0; i < 2; i++) {
        			temp[i] = stack.pop();
        			sumNum += temp[i];
        		}
        		
        		for (int i = 1; i >= 0; i--) {
        			stack.push(temp[i]);
        		}
        		
        		stack.push(sumNum);
        	} else if ("D".equals(op)) {
        		stack.push(stack.peek() * 2);
        	} else if ("C".equals(op)) {
        		stack.pop();
        	} else {
        		stack.push(Integer.parseInt(op));
        	}
        }
        
        int sum = 0;
        while (!stack.isEmpty()) {
        	sum += stack.pop();
        }
        
        return sum;
    }
	
}
