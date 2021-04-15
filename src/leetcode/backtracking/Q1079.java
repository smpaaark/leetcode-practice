package leetcode.backtracking;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q1079 {

	public static void main(String[] args) {
		Q1079 q = new Q1079();
		System.out.println(q.numTilePossibilities("AAABBC"));
	}
	
	public int numTilePossibilities(String tiles) {
		char[] charArray = tiles.toCharArray();
		Set<String> set = new HashSet<>();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		
		for (int i = 0; i < charArray.length; i++) {
			map.put(charArray[i], map.get(charArray[i]) - 1);
			backTracking(String.valueOf(charArray[i]), charArray, set, map);
			map.put(charArray[i], map.get(charArray[i]) + 1);
		}
		
		return set.size();
    }

	private void backTracking(String currentLetter, char[] charArray, Set<String> set, Map<Character, Integer> map) {
		if (currentLetter.length() == charArray.length) {
			if (!set.contains(currentLetter)) {
				set.add(currentLetter);
			}
			
			return;
		}
		
		if (!set.contains(currentLetter)) {
			set.add(currentLetter);
		}
		
		for (int i = 0; i < charArray.length; i++) {
			if (map.get(charArray[i]) > 0) {
				map.put(charArray[i], map.get(charArray[i]) - 1);
				backTracking(currentLetter + charArray[i], charArray, set, map);
				map.put(charArray[i], map.get(charArray[i]) + 1);
			}
		}
	}
	
}
