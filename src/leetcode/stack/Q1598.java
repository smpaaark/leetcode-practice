package leetcode.stack;

import java.util.Stack;

/**
 * LeetCode
 * 1598. Crawler Log Folder
 */
public class Q1598 {

    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        stack.push("Main");
        for (String operation : logs) {
            switch (operation) {
                case "../" :
                    if (!"Main".equals(stack.peek())) {
                      stack.pop();
                    }
                    break;
                case "./" :
                    break;
                default:
                    stack.push(operation.split("/")[0]);
                    break;
            }
        }

        return stack.size() - 1;
    }

}
