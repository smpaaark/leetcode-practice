package leetcode.graph;

import java.util.LinkedList;
import java.util.Queue;

public class Q207 {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] matrix = new int[numCourses][numCourses];
        int[] preCountArray = new int[numCourses];

        for (int i = 0; i < prerequisites.length; i++) {
            int before = prerequisites[i][1];
            int after = prerequisites[i][0];
            matrix[before][after] = 1;
            preCountArray[after]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < preCountArray.length; i++) {
            if (preCountArray[i] == 0) {
                queue.offer(i);
            }
        }

        int count = 0;
        while (!queue.isEmpty()) {
            int course = queue.poll();
            count++;
            for (int i = 0; i < numCourses; i++) {
                if (matrix[course][i] == 1) {
                    preCountArray[i]--;
                    if (preCountArray[i] == 0) {
                        queue.offer(i);
                    }
                }
            }
        }

        return count == numCourses;
    }

}
