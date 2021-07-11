package leetcode.interview.array;

/**
 * LeetCode
 * 26. Remove Duplicates from Sorted Array
 * array
 */
public class Q26 {

    public int removeDuplicates(int[] nums) {
        int putIndex  = nums.length > 0 ? 1 : 0; // 중복되지 않는 값이 입력될 index
        for (int num : nums) {
            if (num > nums[putIndex - 1]) { // 입력될 index - 1은 현재까지 중복되지 않은 값 중 마지막 index
                nums[putIndex++] = num; // 중복되지 않은 값이라면 해당 값을 putIndex에 넣고 putIndex를 1 증가시킨다.
            }
        }

        return putIndex; // putIndex가 중복을 제거하고 남은 수들의 갯수이다.
    }

}
