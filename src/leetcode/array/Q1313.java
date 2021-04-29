package leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode
 * 1313. Decompress Run-Length Encoded List
 */
public class Q1313 {

    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i + 1]);
            }
        }

        int[] result = new int[list.size()];
        int index = 0;
        for (Integer num : list) {
            result[index++] = num;
        }

        return result;
    }

}
