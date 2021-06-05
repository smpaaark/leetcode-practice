package leetcode.sort;

import java.util.PriorityQueue;

/**
 * LeetCode
 * 1030. Matrix Cells in Distance Order
 */
public class Q1030 {

    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] result = new int[rows * cols][2];
        PriorityQueue<Point> queue = new PriorityQueue<>((a, b) -> {
            return a.distance - b.distance;
        });

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int distance = Math.abs(rCenter - i) + Math.abs(cCenter - j);
                queue.offer(new Point(i, j, distance));
            }
        }

        int i = 0;
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            result[i][0] = point.x;
            result[i++][1] = point.y;
        }

        return result;
    }

    static class Point {

        int x;
        int y;
        int distance;

        public Point(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }

    }

}
