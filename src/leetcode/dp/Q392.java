package leetcode.dp;

public class Q392 {

	public static void main(String[] args) {
		Q392 q = new Q392();
		System.out.println(q.isSubsequence("abc", "ahbgdc"));
	}
	
//	public boolean isSubsequence(String s, String t) {
//        for (char c : s.toCharArray()) {
//        	int index = t.indexOf(String.valueOf(c));
//        	if (index == -1) {
//        		return false;
//        	}
//        	
//        	t = t.substring(index + 1);
//        }
//        
//        return true;
//    }
	
	public boolean isSubsequence(String s, String t) {
		if (s == null || s.trim().isEmpty()) {
			return true;
		}
		
		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();
        for (int sIndex = 0, tIndex = 0; sIndex < s.length() && tIndex < t.length(); ) {
        	if (sArray[sIndex] == tArray[tIndex]) {
        		sIndex++;
        		tIndex++;
        	} else {
        		tIndex++;
        	}
        	
        	if (sIndex == sArray.length) {
        		return true;
        	}
        }
        
        return false;
    }
	
}
