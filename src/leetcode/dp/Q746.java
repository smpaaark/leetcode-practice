package leetcode.dp;

public class Q746 {
	
	public static void main(String[] args) {
		Q746 q = new Q746();
		System.out.println(q.minCostClimbingStairs(new int[] {10,15,20}));
		System.out.println(q.minCostClimbingStairs(new int[] {1,100,1,1,1,100,1,1,100,1}));
	}
	
	public int minCostClimbingStairs(int[] cost) {
		int[] dp = new int[cost.length + 1];
        for (int i = 2; i < dp.length; i++) {
        	dp[i] = Math.min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
        }
        
        return dp[dp.length - 1];
    }
	
}
