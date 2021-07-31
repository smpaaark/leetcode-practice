package leetcode.interview.array;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode
 * 118. Pascal's Triangle
 * Array
 */
public class Q118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> tempArray = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) { // 양 끝 요소이면 항상 1
                    tempArray.add(1);
                } else { // 가운데 요소이면 위 리스트의 2개 요소 합
                    List<Integer> upArray = result.get(i - 1);
                    tempArray.add(upArray.get(j - 1) + upArray.get(j));
                }
            }

            result.add(tempArray);
        }

        return result;
    }

}
