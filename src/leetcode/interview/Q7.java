package leetcode.interview;

/**
 * LeetCode
 * 7. Reverse Integer
 */
public class Q7 {

    public static void main(String[] args) {
        Q7 q = new Q7();
        System.out.println(q.reverse(-123));
    }

    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) {
                return 0;
            }

            result = newResult;
            x /= 10;
        }

        return result;
    }

}
