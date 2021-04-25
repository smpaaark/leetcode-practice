package leetcode.bit;

/**
 * LeetCode
 * 1486. XOR Operation in an Array
 * 시간 복잡도: O(n)
 * 공간 복잡도: O(1)
 */
public class Q1486 {

    public int xorOperation(int n, int start) {
        int result = start;
        for (int i = 1; i < n; i++) {
            result ^= start + (2 * i);
        }

        return result;
    }

}
