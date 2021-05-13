package leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode
 * 1415. The k-th Lexicographical String of All Happy Strings of Length n
 */
public class Q1415 {

    private char[] letters = {'a', 'b', 'c'};
    private List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Q1415 q = new Q1415();
        System.out.println(q.getHappyString(1, 4));
    }

    public String getHappyString(int n, int k) {
        for (int i = 0; i < letters.length; i++) {
            backTracking(letters[i] + "", n);
        }

        return k <= list.size() ? list.get(k - 1) : "";
    }

    private void backTracking(String tempStr, int n) {
        if (tempStr.length() == n) {
            list.add(tempStr);

            return;
        }

        for (int i = 0; i < letters.length; i++) {
            if (tempStr.charAt(tempStr.length() - 1) != letters[i]) {
                backTracking(tempStr + letters[i], n);
            }
        }
    }

}
