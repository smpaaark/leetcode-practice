package leetcode.interview.string;

/**
 * LeetCode
 * 14. Longest Common Prefix
 * String
 */
public class Q14 {

    public String longestCommonPrefix(String[] strs) {
        String result = strs[0]; // 0번 문자열로 결과 초기화
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(result) != 0) { // 접두사 일치하는 문자열 찾을때까지 뒤의 1자리씩 줄이면서 반복
                result = result.substring(0, result.length() - 1);
            }
        }

        return result;
    }

}
