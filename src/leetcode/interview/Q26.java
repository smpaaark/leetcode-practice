package leetcode.interview;

/**
 * LeetCode
 * 26. Remove Duplicates from Sorted Array
 */
public class Q26 {

    public static void main(String[] args) {
        Q26 q = new Q26();
        System.out.println(q.removeDuplicates(new int[]{1,1,2}));
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        int result = nums.length;
        int prevIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if ((nums[prevIndex] ^ nums[i]) == 0) {
                result--;
            } else {
                nums[prevIndex + 1] = nums[i];
                prevIndex += 1;
            }
        }

        return result;
    }

}
