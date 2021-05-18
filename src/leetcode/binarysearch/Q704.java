package leetcode.binarysearch;

import leetcode.dp.Q70;

/**
 * LeetCode
 * 704. Binary Search
 */
public class Q704 {

    public static void main(String[] args) {
        Q704 q = new Q704();
        System.out.println(q.search(new int[]{-1,0,3,5,9,12}, 9));
    }

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

}
