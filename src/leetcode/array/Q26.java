package leetcode.array;

public class Q26 {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int passIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[passIndex - 1]) {
                nums[passIndex++] = nums[i];
            }
        }

        return passIndex;
    }

}
