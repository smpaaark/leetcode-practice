package leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode
 * 961. N-Repeated Element in Size 2N Array
 */
public class Q961 {

    public int repeatedNTimes(int[] A) {
        int n = A.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : A) {
            if (map.containsKey(num)) {
                if (map.get(num) == n - 1) {
                    return num;
                } else {
                    map.put(num, map.get(num) + 1);
                }
            } else {
                map.put(num, 1);
            }
        }

        return 0;
    }

}
