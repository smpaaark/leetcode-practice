package leetcode.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q210 {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[][] matrix = new int[numCourses][numCourses];
        int[] preCountArray = new int[numCourses];

        for (int i = 0; i < prerequisites.length; i++) {
            int before = prerequisites[i][1];
            int after = prerequisites[i][0];
            matrix[before][after] = 1;
            preCountArray[after]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i <preCountArray.length; i++) {
            if (preCountArray[i] == 0) {
                queue.offer(i);
            }
        }

        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            int course = queue.poll();
            list.add(course);
            for (int i = 0; i < matrix[course].length; i++) {
                if (matrix[course][i] == 1) {
                    preCountArray[i]--;
                    if (preCountArray[i] == 0) {
                        queue.add(i);
                    }
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result.length == numCourses ? result : new int[0];
    }

}
