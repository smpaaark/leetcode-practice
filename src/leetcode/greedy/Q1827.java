package leetcode.greedy;

/**
 * LeetCode
 * 1827. Minimum Operations to Make the Array Increasing
 * 시간 복잡도: O(n)
 * 공간 복잡도: O(1)
 */
public class Q1827 {

    public static void main(String[] args) {
        Q1827 q = new Q1827();
        System.out.println(q.minOperations(new int[] {1,1,1}));
    }

    public int minOperations(int[] nums) {
        int maxNum = nums[0];
        int result = 0;
        for (int i = 1; i < nums.length; i++) { // n
            if (nums[i] <= maxNum) {
                result += maxNum - nums[i] + 1;
                nums[i] = nums[i - 1] + 1;
            }

            maxNum = nums[i];
        }

        return result;
    }

}
