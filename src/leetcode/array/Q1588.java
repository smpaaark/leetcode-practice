package leetcode.array;

/**
 * LeetCode
 * 1588. Sum of All Odd Length Subarrays
 */
public class Q1588 {

    public int sumOddLengthSubarrays(int[] arr) {
        int arrLength = arr.length;
        int sum = 0;
        for (int length = 1; length <= arrLength; length += 2) {
            for (int i = 0; i < arrLength - length + 1; i++) {
                for (int j = 0; j < length; j++) {
                    sum += arr[i + j];
                }
            }
        }

        return sum;
    }

}
