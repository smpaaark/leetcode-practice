package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class Q118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> rowList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    rowList.add(1);
                } else {
                    List<Integer> prevRowList = result.get(i - 1);
                    rowList.add(prevRowList.get(j - 1) + prevRowList.get(j));
                }
            }

            result.add(rowList);
        }

        return result;
    }

}
