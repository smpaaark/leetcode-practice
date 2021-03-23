package leetcode.bit;

import java.util.Arrays;

public class Q1720 {
	
	public static void main(String[] args) {
		Q1720 q = new Q1720();
		System.out.println(Arrays.toString(q.decode(new int[] {1,2,3}, 1)));
		System.out.println(Arrays.toString(q.decode(new int[] {6,2,7,3}, 4)));
	}
	
	public int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;
        
        for (int i = 1; i < arr.length; i++) {
        	arr[i] = arr[i - 1] ^ encoded[i - 1];
        }
        
        return arr;
    }
	
}
