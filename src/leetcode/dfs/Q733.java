package leetcode.dfs;

public class Q733 {
	
	private int[] dx = {-1, 1, 0, 0};
	private int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) {
		Q733 q = new Q733();
		int[][] result = q.floodFill(new int[][] {{1,1,1},{1,1,0},{1,0,1}}, 1, 1, 2);
		
		for (int[] array : result) {
			for (int num : array) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
	
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean[][] visit = new boolean[image.length][];
        for (int i = 0; i < visit.length; i++) {
        	visit[i] = new boolean[image[i].length];
        }
        
        dfs(image, sr, sc, newColor, visit, image[sr][sc]);
        
        return image;
    }

	private void dfs(int[][] image, int x, int y, int newColor, boolean[][] visit, int targetColor) {
		visit[x][y] = true;
		if (targetColor == image[x][y]) {
			image[x][y] = newColor;
		}
		
		for (int i = 0; i < 4; i++) {
			int tempX = x + dx[i];
			int tempY = y + dy[i];
			if (tempX >= 0 && tempX < image.length && tempY >= 0 && tempY <= image[tempX].length - 1 && !visit[tempX][tempY] && image[tempX][tempY] == targetColor) {
				visit[tempX][tempY] = true;
				dfs(image, tempX, tempY, newColor, visit, targetColor);
			}
		}
	}
	
}
