package leetcode.sort;

public class Q1370 {
	
	public static void main(String[] args) {
		Q1370 q = new Q1370();
		
		
		System.out.println(q.sortString("leetcode"));
//		System.out.println(q.sortString("aaaabbbbcccc"));
//		System.out.println(q.sortString("rat"));
	}
	
	public String sortString(String s) {
        int[] array = new int[26];
        for (char c : s.toCharArray()) {
        	array[c - 97]++;
        }
        
        int length = s.length();
        StringBuilder sb = new StringBuilder();
        while (length > 0) {
	        for (int i = 0; i < array.length; i++) {
	        	if (array[i] > 0) {
	        		sb.append((char) (i + 'a'));
	        		length--;
	        		array[i]--;
	        		if (length == 0) {
	        			return sb.toString();
	        		}
	        	}
	        }
	        
	        for (int i = array.length - 1; i >= 0; i--) {
	        	if (array[i] > 0) {
	        		sb.append((char) (i + 'a'));
	        		length--;
	        		array[i]--;
	        		if (length == 0) {
	        			return sb.toString();
	        		}
	        	}
	        }
        }
        
        return sb.toString();
    }
	
}
