package leetcode.interview.binarysearch;

/**
 * LeetCode
 * 69. Sqrt(x)
 * Binary Search
 */
public class Q69 {

    public int mySqrt(int x) {
        if (x == 0) { // x == 0이면 0 반환
            return 0;
        }

        int start = 1; // x > 0이면 정답은 0보다 크기 때문에 start를 1로 잡는다.
        int end = x;
        while (start <= end) {
            int mid = (start + end) / 2; // 중간 값
            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {// 결과 조건
                return mid;
            } else if (mid > x / mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

}
