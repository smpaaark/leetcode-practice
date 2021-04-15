package leetcode.backtracking;

import java.util.HashSet;
import java.util.Set;

public class Q1641 {

	private static String[] vowel = {"a", "e", "i", "o", "u"};
	
	public static void main(String[] args) {
		Q1641 q = new Q1641();
		System.out.println(q.countVowelStrings(33));
	}
	
	public int countVowelStrings(int n) {
		Set<String> set = new HashSet<>();
		for (int i = 0; i < vowel.length; i++) {
			backTracking(i, vowel[i], n, set);
		}
		
		return set.size();
    }

	private void backTracking(int startIndex, String currentString, int n, Set<String> set) {
		if (currentString.length() == n) {
			if (!set.contains(currentString)) {
				set.add(currentString);
			}
			
			return;
		}
		
		for (int i = startIndex; i < vowel.length; i++) {
			backTracking(i, currentString + vowel[i], n, set);
		}
	}
	
}
