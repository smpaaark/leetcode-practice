package leetcode.hashtable;

import java.util.HashSet;
import java.util.Set;

public class Q771 {
	
	public static void main(String[] args) {
		Q771 q = new Q771();
		System.out.println(q.numJewelsInStones("aA", "aAAbbbb"));
		System.out.println(q.numJewelsInStones_other("z", "ZZ"));
	}
	
	public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
        	if (!set.contains(jewels.charAt(i))) {
        		set.add(jewels.charAt(i));
        	}
        }
        
        int result = 0;
        for (int i = 0; i < stones.length(); i++) {
        	if (set.contains(stones.charAt(i))) {
        		result++;
        	}
        }
        
        return result;
    }
	
	public int numJewelsInStones_other(String J, String S) {
        if(J == null || J.isEmpty() || S == null || S.isEmpty()) return 0;
        
        int[] dict = new int[128];
        
        for(int i = 0; i < J.length(); i++){
            ++dict[J.charAt(i)];
        }
        
        int count = 0;
        for(int i = 0; i < S.length(); i++){
            if(dict[S.charAt(i)] > 0){
                count++;
            }
        }
        return count;
    }
	
}
