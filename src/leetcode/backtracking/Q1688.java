package leetcode.backtracking;

public class Q1688 {
	
	public static void main(String[] args) {
		Q1688 q = new Q1688();
		System.out.println(q.numberOfMatches(7));
		System.out.println(q.numberOfMatches(14));
		System.out.println(q.numberOfMatches_backtracking(7));
		System.out.println(q.numberOfMatches_backtracking(14));
	}
	
	public int numberOfMatches(int n) {
		int count = 0;
        while (n > 1) {
        	if (n % 2 == 0) {
        		count += n / 2;
        		n /= 2;
        	} else {
        		count += (n - 1) / 2;
        		n = (n - 1) / 2 + 1;
        	}
        }
        
        return count;
    }
	
	public int numberOfMatches_backtracking(int n) {
		return backtracking(n);
    }

	private int backtracking(int n) {
		if (n == 1) {
			return 0;
		}
		
		if (n % 2 == 0) {
			return (n / 2) + backtracking(n / 2);
		} else {
			return ((n - 1) / 2) + backtracking((n - 1) / 2 + 1);
		}
	}
	
}
