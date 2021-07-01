package leetcode.sort;

import java.util.Arrays;

/**
 * LeetCode
 * 88. Merge Sorted Array
 */
public class Q88 {

    public static void main(String[] args) {
        Q88 q = new Q88();
        q.merge(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tempNum1 = null;
        if (m > 0) {
            tempNum1 = Arrays.copyOf(nums1, m);
        }

        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (index1 < m && index2 < n) {
                if (tempNum1[index1] <= nums2[index2]) {
                    nums1[i] = tempNum1[index1++];
                } else {
                    nums1[i] = nums2[index2++];
                }
            } else if (index1 < m) {
                nums1[i] = tempNum1[index1++];
            } else if (index2 < n) {
                nums1[i] = nums2[index2++];
            }
        }
    }

}
