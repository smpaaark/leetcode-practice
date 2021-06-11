package leetcode.string;

/**
 * LeetCode
 * 1684. Count the Number of Consistent Strings
 */
public class Q1684 {

    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] alphabet = new boolean[26];
        for (char c : allowed.toCharArray()) {
            alphabet[c - 'a'] = true;
        }

        int count = words.length;
        for (String s : words) {
            for (char c : s.toCharArray()) {
                if (!alphabet[c - 'a']) {
                    --count;
                    break;
                }
            }
        }

        return count;
    }

}
