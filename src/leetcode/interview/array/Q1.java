package leetcode.interview.array;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode
 * 1. Two Sum
 * array
 */
public class Q1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // Map<값, index> 생성
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) { // target - nums[i] -> nums[i]가 target이 되기 위해 필요한 값
                return new int[]{i, map.get(target - nums[i])}; // 해당 값이 map에 있으면 현재 index와 target - nums[i]의 index를 리턴
            }

            map.put(nums[i], i); // target - nums[i]이 map에 없으면 현재 값과 index를 map에 추가
        }

        return null;
    }

}
