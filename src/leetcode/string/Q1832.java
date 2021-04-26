package leetcode.string;

/**
 * LeetCode
 * 1832. Check if the Sentence Is Pangram
 * 시간 복잡도: O(n)
 * 공간 복잡도: O(1)
 */
public class Q1832 {
	
	public boolean checkIfPangram(String sentence) {
		boolean[] visit = new boolean[26];
		int count = 0;
		for (char c: sentence.toCharArray()) {
			int index = c - 'a';
			if (!visit[index]) {
				visit[index] = true;
				count++;
				
				if (count == 26) {
					return true;
				}
			}
		}
		
		return false;
	}
	
}
