package leetcode.recursion;

public class Q1137 {
	
	private int[] num = new int[38];
	
	public static void main(String[] args) {
		Q1137 q = new Q1137();
		System.out.println(q.tribonacci(4));
	}
	
	
	public int tribonacci(int n) {
        if (n == 0) {
        	return 0;
        } else if (n == 1 || n == 2) {
        	num[n] = 1;
        	return 1;
        }
        
        
        return recursion(n - 3) + recursion(n - 2) +recursion(n - 1);
    }


	private int recursion(int number) {
		return num[number] != 0 ? num[number] : num[number - 1] + num[number - 2] + num[number - 3];
	}
	
}
