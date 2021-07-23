package leetcode.interview.sorting;

/**
 * LeetCode
 * 169. Majority Element
 * Sorting
 */
public class Q169 {

    public int majorityElement(int[] nums) {
        int count = 0; // 남은 count
        int majorNum = 0; // major 수
        for (int num: nums) {
            if (count == 0) { // 아직 major 수가 정해지지 않은 상태
                majorNum = num; // num을 major 수로 지정
            }

            if (num != majorNum) { // num과 majorNum이 다르면 majorNum의 count를 감소시킨다. (상쇄 개념)
                count--;
            } else { // num과 majorNum이 같으면 count를 +1 시킨다. (목숨이 하나 생기는 개념)
                count++;
            }
        }

        return majorNum;
    }

}
