package leetcode.sort;

/**
 * LeetCode
 * 922. Sort Array By Parity II
 */
public class Q922 {

    public int[] sortArrayByParityII(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0 && nums[i] % 2 != 0) {
                findEven(nums, i);
            } else if (i % 2 != 0 && nums[i] % 2 == 0) {
                findOdd(nums, i);
            }
        }

        return nums;
    }

    private void findOdd(int[] nums, int index) {
        for (int i = index + 1; i < nums.length; i++) {
            if (i % 2 == 0 && nums[i] % 2 != 0) {
                change(nums, index, i);
                return;
            }
        }
    }

    private void findEven(int[] nums, int index) {
        for (int i = index + 1; i < nums.length; i++) {
            if (i % 2 != 0 && nums[i] % 2 == 0) {
                change(nums, index, i);
                return;
            }
        }
    }

    private void change(int[] nums, int i1, int i2) {
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }

}
