package leetcode.array;

public class Q1672 {
	
	public static void main(String[] args) {
		Q1672 q = new Q1672();
		System.out.println(q.maximumWealth(new int[][] {{1,2,3},{3,2,1}}));
		System.out.println(q.maximumWealth(new int[][] {{1,5},{7,3},{3,5}}));
		System.out.println(q.maximumWealth(new int[][] {{2,8,7},{7,1,3}, {1,9,5}}));
	}
	
	public int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;
        for (int[] account : accounts) {
        	int sum = 0;
        	for (int amount : account) {
        		sum += amount;
        	}
        	
        	maximumWealth = Math.max(maximumWealth, sum);
        }
        
        return maximumWealth;
    }
	
}
