package leetcode.greedy;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode
 * 1217. Minimum Cost to Move Chips to The Same Position
 * 시간 복잡도: O(n)
 * 공간 복잡도: O(1)
 */
public class Q1217 {

    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for (int num : position) { // n
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return Math.min(even, odd);
    }

}
