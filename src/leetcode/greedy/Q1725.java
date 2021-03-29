package leetcode.greedy;

public class Q1725 {
	
	public static void main(String[] args) {
		Q1725 q = new Q1725();
		System.out.println(q.countGoodRectangles(new int[][] {{5,8},{3,9},{5,12},{16,5}}));
		System.out.println(q.countGoodRectangles(new int[][] {{2,3},{3,7},{4,3},{3,7}}));
	}
	
	public int countGoodRectangles(int[][] rectangles) {
        int maxLen = 0;
        int result = 0;
        for (int i = 0; i < rectangles.length; i++) {
        	int len = Math.min(rectangles[i][0], rectangles[i][1]);
        	if (maxLen < len) {
        		maxLen = len;
        		result = 1;
        	} else if (maxLen == len) {
        		result++;
        	}
        }
        
        return result;
    }
	
}
