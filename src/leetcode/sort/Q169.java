package leetcode.sort;

import java.util.Arrays;

public class Q169 {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

}
