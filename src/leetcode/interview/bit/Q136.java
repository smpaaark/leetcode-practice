package leetcode.interview.bit;

import java.util.Arrays;

/**
 * LeetCode
 * 136. Single Number
 * Bit manipulation
 */
public class Q136 {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR은 자기 자신과 같은 숫자랑 연산할 경우 0이되고, 0이랑 연산하면 자기 자신이 된다.
        }

        return result;
    }

}

