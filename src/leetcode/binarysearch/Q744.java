package leetcode.binarysearch;

/**
 * LeetCode
 * 744. Find Smallest Letter Greater Than Target
 */
public class Q744 {

    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return letters[start % letters.length];
    }

}
