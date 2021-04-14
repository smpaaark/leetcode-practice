package leetcode.recursion;

public class Q1137 {
	
	private int[] num = new int[38];
	
	public static void main(String[] args) {
		Q1137 q = new Q1137();
		System.out.println(q.tribonacci(3));
	}
	
	
	public int tribonacci(int n) {
        if (n == 0) {
        	return 0;
        } else if (n == 1 || n == 2) {
        	num[n] = 1;
        	return 1;
        }
        
        int result  = 0;
        result += num[n - 3] > 0 ? num[n - 3] : tribonacci(n - 3);
        result += num[n - 2] > 0 ? num[n - 2] : tribonacci(n - 2);
        result += num[n - 1] > 0 ? num[n - 1] : tribonacci(n - 1);
        
        num[n] = result;
        
        return result;
    }
	
}
