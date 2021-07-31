package leetcode.interview.array;

import java.util.Arrays;

/**
 * LeetCode
 * 66. Plus One
 * Array
 */
public class Q66 {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i]++ < 9) { // 현재 숫자가 9보다 작으면 1더하고 바로 리턴
                return digits;
            }

            digits[i] = 0; // 현재 숫자가 9이면 1추가하면 10이므로 0으로 설정하고 다음 반복문으로 진행
        }

        int[] newDigits = new int[digits.length + 1]; // 여기까지 왔다는 것은 첫자리 수가 9여서 자릿수가 늘어났다는 것을 의미하므로 배열의 크기를 1 크게 생성
        newDigits[0] = 1; // 0번째 요소만 1로 세팅하면 나머지는 모두 0으로 초기화됨

        return newDigits;
    }

}
