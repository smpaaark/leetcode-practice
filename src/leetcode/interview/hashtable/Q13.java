package leetcode.interview.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode
 * 13. Roman to Integer
 * HashTable
 */
public class Q13 {

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>(); // 로마 숫자 map에 저장
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int length = s.length();
        int result = map.get(s.charAt(length - 1)); // 가장 오른쪽 숫자를 결과에 저장
        for (int i = length - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) { // 오른쪽 숫자보다 크면 더한다.
                result += map.get(s.charAt(i));
            } else { // 오른쪽 숫자보다 작으면 뺀다.
                result -= map.get(s.charAt(i));
            }
        }

        return result;
    }

}
