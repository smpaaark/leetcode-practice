package leetcode.binarysearch;

/**
 * LeetCode
 * 69. Sqrt(x)
 */
public class Q69 {

    public static void main(String[] args) {
        Q69 q = new Q69();
        System.out.println(q.mySqrt(8));
    }

    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid == x / mid) {
                return mid;
            }

            if (mid > x / mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }

}
