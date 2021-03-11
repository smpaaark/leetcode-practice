package leetcode.dp;

public class Q1025 {
	
	public static void main(String[] args) {
		Q1025 q = new Q1025();
		System.out.println(q.divisorGame(2));
		System.out.println(q.divisorGame(3));
	}
	
	public boolean divisorGame(int N) {
        return (N % 2 == 0) ? true : false;
    }
	
}
