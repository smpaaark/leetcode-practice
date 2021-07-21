package leetcode.interview.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * LeetCode
 * 22. Generate Parentheses
 * Backtracking
 */
public class Q22 {

    public List<String> generateParenthesis(int n) {
        List<String> resultList = new ArrayList<>();
        backTracking(resultList, "", 0, 0, n);

        return resultList;
    }

    private void backTracking(List<String> resultList, String str, int open, int close, int n) {
        if (str.length() == n * 2) { // 문자열이 n * 2이면 완성된 것이므로 리스트에 추가한다.
            resultList.add(str);
            return;
        }

        if (open < n) { // open이 n보다 작으면 추가할 수 있다.
            backTracking(resultList, str + "(", open + 1, close, n);
        }

        if (close < open) { // close는 open보다 작아야 추가할 수 있다.
            backTracking(resultList, str + ")", open, close + 1, n);
        }
    }

}
