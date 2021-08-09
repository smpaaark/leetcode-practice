package leetcode.heap;

import java.util.PriorityQueue;

public class Q378 {

    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Point> queue = new PriorityQueue<>((a, b) -> {
            return a.val - b.val;
        });

        for (int i = 0; i < matrix[0].length; i++) {
            queue.offer(new Point(0, i, matrix[0][i]));
        }

        while (k-- > 1) {
            Point point = queue.poll();
            if (point.x < matrix.length - 1) {
                queue.offer(new Point(point.x + 1, point.y, matrix[point.x + 1][point.y]));
            }
        }

        return queue.poll().val;
    }

    class Point {

        int x;
        int y;
        int val;

        public Point(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }

    }

}
