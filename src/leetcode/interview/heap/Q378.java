package leetcode.interview.heap;

import java.awt.*;
import java.util.PriorityQueue;

/**
 * LeetCode
 * 378. Kth Smallest Element in a Sorted Matrix
 */
public class Q378 {

    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Point> queue = new PriorityQueue<>();
        for (int i = 0; i < matrix[0].length; i++) { // 0번 행의 수들을 모두 heap에 넣는다.
            queue.offer(new Point(0, i, matrix[0][i]));
        }

        int n = matrix.length;
        while (k-- > 1) { // k가 1보다 크면 반복한다.
            Point point = queue.poll();
            if (point.x < n - 1) { // poll한 값의 아래 요소와 오른쪽 요소의 값 비교를 위해 아래 요소를 heap에 넣는다.
                queue.offer(new Point(point.x + 1, point.y, matrix[point.x + 1][point.y]));
            }
        }

        return queue.peek().val;
    }

    class Point implements Comparable<Point>{

        int x;
        int y;
        int val;

        public Point(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }

        @Override
        public int compareTo(Point point) {
            return this.val - point.val;
        }

    }

}
