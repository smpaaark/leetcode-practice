package leetcode.recursion;

/**
 * LeetCode
 * 1863. Sum of All Subset XOR Totals
 */
public class Q1863 {

    private int xorSum = 0;

    public static void main(String[] args) {
        Q1863 q = new Q1863();
        System.out.println(q.subsetXORSum(new int[] {5, 1, 6}));
    }

    public int subsetXORSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            xorSum += nums[i];
        }

        for (int length = 2; length <= nums.length; length++) {
            for (int i = 0; i < nums.length - length + 1; i++) {
                recursion(nums, i, nums[i],1, length);
            }
        }

        return xorSum;
    }

    private void recursion(int[] nums, int startIndex, int tempSum, int count, int length) {
        if (count == length) {
            xorSum += tempSum;
            return;
        }

        for (int i = startIndex; i < nums.length - 1; i++) {
            recursion(nums, i + 1, tempSum ^ nums[i + 1], count + 1, length);
        }
    }

}
