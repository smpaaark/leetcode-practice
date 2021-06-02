package leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode
 * 1002. Find Common Characters
 */
public class Q1002 {

    public static void main(String[] args) {
        Q1002 q = new Q1002();
        System.out.println(q.commonChars(new String[] {"bella","label","roller"}));
    }

    public List<String> commonChars(String[] words) {
        int[] standard = new int[26];
        for (char c : words[0].toCharArray()) {
            standard[c - 'a']++;
        }

        for (int i = 1; i < words.length; i++) {
            int[] temp = new int[26];
            for (char c : words[i].toCharArray()) {
                temp[c - 'a']++;
            }

            for (int j = 0; j < standard.length; j++) {
                if (temp[j] < standard[j]) {
                    standard[j] = temp[j];
                }
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < standard.length; i++) {
            for (int j = 0; j < standard[i]; j++) {
                char c = (char)(i + 'a');
                result.add(String.valueOf(c));
            }
        }

        return result;
    }

}
