package leetcode.interview.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * LeetCode
 * 350. Intersection of Two Arrays II
 * Binary Search
 */
public class Q350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1); // nums1을 오름차순 정렬
        List<Integer> nums1List = new ArrayList<>();
        for (int num : nums1) { // ArrayList에 담는다.
            nums1List.add(num);
        }

        List<Integer> ret = new ArrayList<>();
        for (int num: nums2) {
            int idx = search(nums1List, num); // 이진 탐색
            if (idx != -1) {  // nums1List에 있으면 ret에 추가
                nums1List.remove(idx); // 추가 했으니 nums1List에서 제거한다.
                ret.add(num);
            }
        }

        int[] retArr = new int[ret.size()];
        int i = 0;
        for (int num : ret) { // ret를 retArr배열로 옮겨 담는다.
            retArr[i++] = num;
        }

        return retArr;
    }

    public int search(List<Integer> nums, int key) { // 이진 탐색
        int high = nums.size() - 1;
        int low = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums.get(mid) == key) {
                return mid;
            } else if (nums.get(mid) > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

}
