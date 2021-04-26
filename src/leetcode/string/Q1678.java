package leetcode.string;

/**
 * LeetCode
 * 1678. Goal Parser Interpretation
 * 시간 복잡도: O(n)
 * 공간 복잡도: O(n)
 */
public class Q1678 {
	
	public static void main(String[] args) {
		Q1678 q = new Q1678();
		System.out.println(q.interpret("G()(al)"));
	}
	
	public String interpret(String command) {
		StringBuilder sb = new StringBuilder(command.replace("()", "o").replace("(al)", "al"));
		
		return sb.toString();
	}
	
}
