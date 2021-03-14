package leetcode.binarysearch;

public class Q1351 {
	
	public static void main(String[] args) {
		Q1351 q = new Q1351();
		System.out.println(q.countNegatives(new int[][] {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));
		System.out.println(q.countNegatives(new int[][] {{3,2},{1,0}}));
	}
	
	// 4, 3, 1, -1
	public int countNegatives(int[][] grid) {
        int start = 0;
        int end = grid.length - 1;
        int mid = (start + end) / 2;
        
        while (start <= end) {
        	mid = (start + end) / 2;
        	if (grid[mid][0] < 0) {
        		end = mid - 1;
        	} else if (grid[mid][0] >= 0) {
        		start = mid + 1;
        		
        	}
        }
    }
	
}
