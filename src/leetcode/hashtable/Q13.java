package leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode
 * 13. Roman to Integer
 */
public class Q13 {

    private Map<String, Integer> map = new HashMap<>();

    public int romanToInt(String s) {
        settingMap();

        char[] cArray = s.toCharArray();
        int result = 0;
        for (int i = 0; i < cArray.length; i++) {
            if (i + 1 < cArray.length && map.get(String.valueOf(cArray[i])) < map.get(String.valueOf(cArray[i + 1]))) {
                result += map.get(String.valueOf(cArray[i]) + String.valueOf(cArray[i + 1]));
                i++;
            } else {
                result += map.get(String.valueOf(cArray[i]));
            }
        }

        return result;
    }

    private void settingMap() {
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
    }

}
