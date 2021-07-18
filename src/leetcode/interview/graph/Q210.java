package leetcode.interview.graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode
 * 210. Course Schedule II
 * Graph
 */
public class Q210 {

    // 기본적인 로직은 Course Schedule 풀이와 같습니다.
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[][] matrix = new int[numCourses][numCourses];
        int[] preCourseCount = new int[numCourses];

        for (int[] pair : prerequisites) {
            int prev = pair[1];
            int ready = pair[0];
            matrix[prev][ready] = 1;
            preCourseCount[ready]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (preCourseCount[i] == 0) {
                queue.offer(i);
            }
        }

        int[] result = new int[numCourses]; // 결과 배열
        int resultIndex = 0; // 결과를 담을 index
        while (!queue.isEmpty()) {
            int course = queue.poll();
            result[resultIndex++] = course; // 결과에 하나씩 추가
            for (int i = 0; i < numCourses; i++) {
                if (matrix[course][i] == 1) {
                    preCourseCount[i]--;
                    if (preCourseCount[i] == 0) {
                        queue.offer(i);
                    }
                }
            }
        }

        return resultIndex == numCourses ? result : new int[0]; // 결과 배열이 모두 채워졌으면 result를 리턴, 아니면 빈 배열을 리턴합니다.
    }

}
