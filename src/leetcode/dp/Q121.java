package leetcode.dp;

public class Q121 {
	
	public static void main(String[] args) {
		Q121 q = new Q121();
		System.out.println(q.maxProfit(new int[] {7,1,5,3,6,4}));
		System.out.println(q.maxProfit(new int[] {7,6,4,3,1}));
	}
	
	public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
        	maxProfit = Math.max(maxProfit, prices[i] - minBuy);
        	minBuy = Math.min(minBuy, prices[i]);
        }
        
        return maxProfit;
    }
	
}
