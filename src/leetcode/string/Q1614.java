package leetcode.string;

/**
 * LeetCode
 * 1614. Maximum Nesting Depth of the Parentheses
 */
public class Q1614 {

    public int maxDepth(String s) {
        int maxCount = 0;
        int currentCount = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else if (c == ')') {
                currentCount--;
            }
        }

        return maxCount;
    }

}
