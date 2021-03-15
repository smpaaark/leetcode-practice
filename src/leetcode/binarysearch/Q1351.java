package leetcode.binarysearch;

public class Q1351 {
	
	public static void main(String[] args) {
		Q1351 q = new Q1351();
		System.out.println(q.countNegatives(new int[][] {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));
		System.out.println(q.countNegatives(new int[][] {{3,2},{1,0}}));
		System.out.println(q.countNegatives(new int[][] {{-1}}));
	}
	
	// 4, 3, 1, -1
	public int countNegatives(int[][] grid) {
        int result = 0;
		for (int i = 0; i < grid.length; i++) {
        	if (grid[i][0] < 0) {
        		result += grid[i].length;
        	} else {
        		result += binarySearch(grid[i]);
        	}
        }
		
		return result;
    }

	private int binarySearch(int[] array) {
		int start = 0;
		int end = array.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (array[mid] >= 0) {
				start = mid + 1;
			} else if (mid > 0 && array[mid - 1] < 0){
				end = mid - 1;
			} else {
				return array.length - mid;
			}
		}
		
		return 0;
	}
	
}
