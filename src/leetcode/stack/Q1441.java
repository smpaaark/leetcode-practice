package leetcode.stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Q1441 {
	
	public static void main(String[] args) {
		Q1441 q = new Q1441();
		System.out.println(q.buildArray(new int[] {1,3}, 3));
		System.out.println(q.buildArray(new int[] {1,2,3}, 3));
		System.out.println(q.buildArray(new int[] {1,2}, 4));
		System.out.println(q.buildArray(new int[] {2,3,4}, 4));
	}
	
	public List<String> buildArray(int[] target, int n) {
		List<String> list = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		int currentNum = 1;
		int targetIndex = 0;
		while (currentNum <= n && targetIndex < target.length) {
			stack.push(currentNum++);
			list.add("Push");
			
			if (stack.peek() == target[targetIndex]) {
				targetIndex++;
			} else {
				stack.pop();
				list.add("Pop");
			}
		}
		
		return list;
    }
	
	public List<String> buildArray_other(int[] target, int n) {
        LinkedList<String> res = new LinkedList<>();
        int i = 1;
        for (int num : target) {
            while(i < num && i < n) {
                ++i;
                res.add("Push");
                res.add("Pop");
            }
            ++i;
            res.add("Push");
        }
        return res;
    }
	
}
