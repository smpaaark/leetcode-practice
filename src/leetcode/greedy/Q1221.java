package leetcode.greedy;

public class Q1221 {

	public static void main(String[] args) {
		Q1221 q = new Q1221();
		System.out.println(q.balancedStringSplit("RLRRLLRLRL"));
		System.out.println(q.balancedStringSplit("RLLLLRRRLR"));
	}
	
	public int balancedStringSplit(String s) {
		int rCount = 0;
		int lCount = 0;
		int result = 0;
        for (char c : s.toCharArray()) {
        	if (c == 'R') {
        		rCount++;
        	} else if (c == 'L') {
        		lCount++;
        	}
        	
        	if (rCount == lCount) {
        		result++;
        		rCount = 0;
        		lCount = 0;
        	}
        }
        
        return result;
    }
	
}