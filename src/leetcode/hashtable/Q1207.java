package leetcode.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * LeetCode
 * 1207. Unique Number of Occurrences
 */
public class Q1207 {

    public static void main(String[] args) {
        Q1207 q = new Q1207();
        System.out.println(q.uniqueOccurrences(new int[] {1,2,2,1,1,3}));
    }

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        Set<Integer> set = new HashSet<>();
        for (int key : map.keySet()) {
            if (set.contains(map.get(key))) {
                return false;
            } else {
                set.add(map.get(key));
            }
        }

        return true;
    }

}
