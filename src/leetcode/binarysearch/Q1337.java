package leetcode.binarysearch;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Q1337 {
	
	public static void main(String[] args) {
		Q1337 q = new Q1337();
		System.out.println(Arrays.toString(q.kWeakestRows(new int[][] {{1,1,0,0,0},
		                                                                {1,1,1,1,0},
		                                                                {1,0,0,0,0},
		                                                                {1,1,0,0,0},
		                                                                {1,1,1,1,1}}, 3)));
	}
	
	public int[] kWeakestRows(int[][] mat, int k) {
		PriorityQueue<Mat> q = new PriorityQueue<Mat>();

		for (int i = 0; i < mat.length; i++) {
			q.offer(new Mat(getSoldierCount(mat[i]), i));
		}
		
		int[] result = new int[k];
		for (int i = 0; i < k; i++) {
			result[i] = q.poll().index;
		}
		
		return result;
    }
	
	private int getSoldierCount(int[] array) {
		int start = 0;
		int end = array.length;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (array[mid] == 1 && mid + 1 == array.length) {
				return mid + 1;
			} else if (array[mid] == 1 && array[mid + 1] == 0) {
				return mid + 1;
			} else if (array[mid] == 1) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		
		return 0;
	}


	static class Mat implements Comparable<Mat>{
		
		private int soldierCount;
		private int index;
		
		public Mat(int soldierCount, int index) {
			super();
			this.soldierCount = soldierCount;
			this.index = index;
		}

		public int getSoldierCount() {
			return soldierCount;
		}
		
		
		public void setSoldierCount(int soldierCount) {
			this.soldierCount = soldierCount;
		}
		
		public int getIndex() {
			return index;
		}
		
		public void setIndex(int index) {
			this.index = index;
		}

		@Override
		public int compareTo(Mat mat) {
			if (this.soldierCount > mat.soldierCount) {
				return 1;
			} else if (this.soldierCount == mat.soldierCount) {
				if (this.index > mat.index) {
					return 1;
				}
			}
			
			return -1;
		}

		@Override
		public String toString() {
			return "Mat [soldierCount=" + soldierCount + ", index=" + index + "]";
		}
		
	}
	
}
