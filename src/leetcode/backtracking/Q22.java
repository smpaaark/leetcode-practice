package leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Q22 {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backTracking(result, n, 0, 0, "");
        return result;
    }

    private void backTracking(List<String> result, int n, int open, int close, String temp) {
        if (temp.length() == n * 2) {
            result.add(temp);
            return;
        }

        if (open < n) {
            backTracking(result, n, open + 1, close, temp + "(");
        }

        if (close < open) {
            backTracking(result, n, open, close + 1, temp + ")");
        }
    }

}
