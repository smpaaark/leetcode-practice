package leetcode.sort;

public class Q1528 {
	
	public static void main(String[] args) {
		Q1528 q = new Q1528();
		System.out.println(q.restoreString("codeleet", new int[] {4,5,6,7,0,2,1,3}));
		System.out.println(q.restoreString("abc", new int[] {0,1,2}));
	}
	
	public String restoreString(String s, int[] indices) {
		char[] newString = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			newString[indices[i]] = s.charAt(i);
		}
		
		return new String(newString);
    }
	
//	public String restoreString(String s, int[] indices) {
//        char[] ca = s.toCharArray();
//        for(int i = 0; i < ca.length; ++i) {
//            while(indices[i] != i) {
//                swap(ca, i, indices[i]);
//                swap(indices, i, indices[i]);
//            }
//        }
//        return new String(ca);
//    }
//
//    void swap(char[] ca, int i, int j) {
//        char c = ca[i];
//        ca[i] = ca[j];
//        ca[j] = c;
//    }
//
//    void swap(int[] a, int i, int j) {
//        int v = a[i];
//        a[i] = a[j];
//        a[j] = v;
//    }
	
}
