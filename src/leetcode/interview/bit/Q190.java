package leetcode.interview.bit;

/**
 * LeetCode
 * 190. Reverse Bits
 * Bit manipulation
 */
public class Q190 {

    public static void main(String[] args) {
        Q190 q = new Q190();
        System.out.println(q.reverseBits(43261596));
    }

    public int reverseBits(int n) {
        if (n == 0) {
            return 0;
        }

        int result = 0;
        for (int i = 0; i < 32; i++) { // 32번 반복
            result <<= 1; // result 비트를 왼쪽으로 1번 이동
            if ((n & 1) == 1) { // n의 1의 자리가 1이면 result에 1을 더한다.
                result++;
            }
            n >>= 1; // n의 다음 비트를 확인하기 위해 오른쪽으로 1번 이동
        }

        return result;
    }

}
