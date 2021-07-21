package leetcode.interview.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode
 * 17. Letter Combinations of a Phone Number
 * Backtracking
 */
public class Q17 {

    private String[] array = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> resultList = new ArrayList<>();

        if (digits.length() > 0) { // 입력 값이 "" 이면 빈 리스트 리턴
            backTracking(resultList, digits, 0, "");
        }

        return resultList;
    }

    private void backTracking(List<String> resultList, String digits, int index, String combination) {
        if (index == digits.length()) { // index 값이 digits의 길이와 같으면 결과에 추가하고 리턴한다.
            resultList.add(combination);
            return;
        }

        String str = array[digits.charAt(index) - '0']; // 현재 숫자를 가져온다.
        for (char c : str.toCharArray()) { // 현재 숫자에 포함된 문자들을 순회하며 백트래킹을 진행한다.
            backTracking(resultList, digits, index + 1, combination + c);
        }
    }

}
