package leetcode.binarysearch;

public class Q852 {
	
	public static void main(String[] args) {
		Q852 q = new Q852();
		System.out.println(q.peakIndexInMountainArray(new int[] {0,1,0}));
		System.out.println(q.peakIndexInMountainArray(new int[] {0,2,1,0}));
		System.out.println(q.peakIndexInMountainArray(new int[] {3,4,5,1}));
		System.out.println(q.peakIndexInMountainArray(new int[] {24,69,100,99,79,78,67,36,26,19}));
	}
	
	public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (true) {
        	int mid = (start + end) / 2;
        	
        	if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
        		start = mid;
        	} else if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1]){
        		end = mid;
        	} else {
        		return mid;
        	}
        	
        }
    }
	
}
