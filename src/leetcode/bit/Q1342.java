package leetcode.bit;

public class Q1342 {
	
	public static void main(String[] args) {
		Q1342 q = new Q1342();
//		System.out.println(q.numberOfSteps(14));
//		System.out.println(q.numberOfSteps(123));
//		
//		System.out.println(q.numberOfSteps_other(14));
		System.out.println(q.numberOfSteps_other(123));
	}
	
	public int numberOfSteps (int num) {
		int step = 0;
        while (num > 0) {
        	if (num % 2 == 0) {
        		num >>= 1;
        	} else {
        		num -= 1;
        	}
        	
        	step++;
        }
        
        return step;
    }
	
	public int numberOfSteps_other(int num) {
		int step = 0;
        while (num > 0) {
        	if ((num & 1) == 0) {
        		num >>= 1;
        	} else {
        		num -= 1;
        	}
        	
        	step++;
        }
        
        return step;
    }
	
}
