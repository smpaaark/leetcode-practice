package leetcode.divideconquer;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode
 * 241. Different Ways to Add Parentheses
 */
public class Q241 {

    public static void main(String[] args) {
        Q241 q = new Q241();
        System.out.println(q.diffWaysToCompute("2*3"));
    }

    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> tempResult = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String part1 = expression.substring(0, i);
                String part2 = expression.substring(i + 1);
                List<Integer> part1Result = diffWaysToCompute(part1);
                List<Integer> part2Result = diffWaysToCompute(part2);
                int result = 0;
                for (int p1 : part1Result) {
                    for (int p2 : part2Result) {
                        switch (c) {
                            case '+':
                                result = p1 + p2;
                                break;
                            case '-':
                                result = p1 - p2;
                                break;
                            case '*':
                                result = p1 * p2;
                                break;
                        }
                        tempResult.add(result);
                    }
                }

            }
        }

        if (tempResult.size() == 0) {
            tempResult.add(Integer.parseInt(expression));
        }

        return tempResult;
    }

}
