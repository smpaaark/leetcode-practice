package leetcode.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode
 * 118. Pascal's Triangle
 */
public class Q118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    list.add(1);
                } else {
                    list.add(result.get(i - 2).get(j - 1) + result.get(i - 2).get(j));
                }
            }

            result.add(list);
        }

        return result;
    }

}
