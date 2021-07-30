package leetcode.interview.greedy;

/**
 * LeetCode
 * 11. Container With Most Water
 * Greedy
 */
public class Q11 {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left)); // 넓이 계산
            if (height[left] < height[right]) { // left의 높이가 더 낮으면 left를 한칸 오른쪽으로 이동시킨다.
                left++;
            } else { // right 높이가 더 낮으면 right를 한칸 왼쪽으로 이동시킨다.
                right--;
            }
        }

        return maxArea;
    }

}
