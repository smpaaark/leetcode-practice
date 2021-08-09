package leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Q17 {

    private final String[] array = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }
        return backTracking(result, digits, 0, "");
    }

    private List<String> backTracking(List<String> result, String digits, int index, String temp) {
        if (temp.length() == digits.length()) {
            result.add(temp);
            return result;
        }

        for (int i = 0; i < array[digits.charAt(index) - '0'].length(); i++) {
            backTracking(result, digits, index + 1, temp + array[digits.charAt(index) - '0'].charAt(i));
        }

        return result;
    }

}
