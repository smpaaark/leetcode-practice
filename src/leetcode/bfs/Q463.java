package leetcode.bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode
 * 463. Island Perimeter
 */
public class Q463 {

    private int[] dx = new int[]{0, 0, -1, 1};
    private int[] dy = new int[]{-1, 1, 0, 0};
    private boolean[][] visit;
    private int result = 0;

    public static void main(String[] args) {
        Q463 q = new Q463();
        q.islandPerimeter(new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}});
    }

    public int islandPerimeter(int[][] grid) {
        visit = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1 && !visit[i][j]) {
                    bfs(i, j, grid);
                }
            }
        }

        return result;
    }

    private void bfs(int x, int y, int[][] grid) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        visit[x][y] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            int pX = point.getX();
            int pY = point.getY();
            int plus = 4;

            for (int i = 0; i < 4; i++) {
                int tempX = pX + dx[i];
                int tempY = pY + dy[i];

                if (tempX >= 0 && tempX < grid.length && tempY >= 0 && tempY < grid[tempX].length && grid[tempX][tempY] == 1) {
                    plus--;
                    if (!visit[tempX][tempY]) {
                        visit[tempX][tempY] = true;
                        queue.offer(new Point(tempX, tempY));
                    }
                }
            }

            result += plus;
        }
    }

    class Point {

        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

    }

}
