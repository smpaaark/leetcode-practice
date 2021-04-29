package leetcode.array;

import java.util.*;

/**
 * LeetCode
 * 1389. Create Target Array in the Given Order
 */
public class Q1389 {

    public static void main(String[] args) {
        Q1389 q = new Q1389();
        System.out.println(Arrays.toString(q.createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1})));
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < index.length; i++) {
            list.add(index[i], nums[i]);
        }

        int[] result = new int[index.length];
        int i = 0;
        for (Integer num : list) {
            result[i++] = num;
        }

        return result;
    }

}
