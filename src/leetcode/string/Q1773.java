package leetcode.string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q1773 {
	
	private static final Map<String, Integer> map = new HashMap<>();
	
	public Q1773() {
		map.put("type", 0);
		map.put("color", 1);
		map.put("name", 2);
	}

	public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int count = 0;
        for (List<String> list : items) {
        	if (list.get(map.get(ruleKey)).equals(ruleValue)) {
        		count++;
        	}
        }
        
        return count;
    }
	
}
