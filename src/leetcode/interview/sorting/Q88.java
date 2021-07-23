package leetcode.interview.sorting;

/**
 * LeetCode
 * 88. Merge Sorted Array
 * Sorting
 */
public class Q88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m - 1; // nums1의 끝 index
        int tail2 = n - 1; // nums2의 끝 index
        int finished = m + n - 1; // 결과 배열의 끝 index

        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ? nums1[tail1--] : nums2[tail2--]; // 끝부터 큰 숫자를 순차적으로 넣는다.
        }

        while (tail2 >= 0) { // tail2가 남았으면 나머지 배열에 넣는다. 이 때 tail2는 안남고 tail1만 남았으면 nums1을 리턴하는 것이기 때문에 추가 작업 없이 남겨두면 된다.
            nums1[finished--] = nums2[tail2--];
        }
    }

}
