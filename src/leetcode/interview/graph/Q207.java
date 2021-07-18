package leetcode.interview.graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode
 * 207. Course Schedule
 * Graph
 */
public class Q207 {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] matrix = new int[numCourses][numCourses]; // x: 강의 번호, y: x 강의를 사전에 들어야 들을 수 있는 강의의 번호
        int[] preCountArray = new int[numCourses]; // 각 강의를 듣기 위해 들어야하는 사전 강의 수

        for (int[] pair : prerequisites) {
            int before = pair[1];
            int after = pair[0];
            matrix[before][after] = 1;
            preCountArray[after]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {  // 사전 강의가 필요 없는 강의들을 먼저 queue에 담는다.
            if (preCountArray[i] == 0) {
                queue.offer(i);
            }
        }

        int count = 0;
        while (!queue.isEmpty()) {
            int course = queue.poll();
            count++;
            for (int i = 0; i < numCourses; i++) {
                if (matrix[course][i] == 1) { // course를 들었으니 i 강의의 사전 강의 수를 1개 감소시킨다.
                    preCountArray[i]--;
                    if (preCountArray[i] == 0) { // i강의의 사전 강의 수가 0이 되면 이제 수강할 수 있으므로 queue에 넣어준다.
                        queue.offer(i);
                    }
                }
            }
        }

        return count == numCourses; // 지금까지 수강한 강의 수 count와 numCourses의 값이 같은지 여부를 리턴한다.
    }

    public boolean canFinish2(int numCourses, int[][] prerequisites) {
        int[][] matrix = new int[numCourses][numCourses]; // i -> j
        int[] indegree = new int[numCourses];

        for (int i = 0; i < prerequisites.length; i++) {
            int ready = prerequisites[i][0];
            int pre = prerequisites[i][1];
            if (matrix[pre][ready] == 0) {
                indegree[ready]++; //duplicate case
            }
            matrix[pre][ready] = 1;
        }

        int count = 0;
        Queue<Integer> queue = new LinkedList();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            int course = queue.poll();
            count++;
            for (int i = 0; i < numCourses; i++) {
                if (matrix[course][i] != 0) {
                    if (--indegree[i] == 0) {
                        queue.offer(i);
                    }
                }
            }
        }

        return count == numCourses;
    }

}
