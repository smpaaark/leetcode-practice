package leetcode.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * LeetCode
 * 69. Sqrt(x)
 */
public class Q69 {

    public static void main(String[] args) {
        Q69 q = new Q69();
        System.out.println(q.intersect(new int[]{1,2,2,1}, new int[]{2,2}));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        List<Integer> numsList = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();
        for (int num : nums2) {
            int index = binarySearch(numsList, num);
            if (index > -1) {
                resultList.add(num);
                numsList.remove(index);
            }
        }

        int[] result = resultList.stream().mapToInt(integer -> integer).toArray();

        return result;
    }

    private int binarySearch(List<Integer> numsList, int num) {
        int start = 0;
        int end = numsList.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (numsList.get(mid) == num) {
                return mid;
            }

            if (numsList.get(mid) > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

}
