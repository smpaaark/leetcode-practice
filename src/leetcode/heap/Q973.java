package leetcode.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Q973 {
	
	public static void main(String[] args) {
		Q973 q = new Q973();
//		System.out.println(Arrays.toString(q.kClosest(new int[][] {{1,3},{-2,2}}, 0)));
		System.out.println(Arrays.toString(q.kClosest(new int[][] 
				{{2,10},{-9,-9},{0,8},{-2,-2},{8,9},{-10,-7},{-5,2},{-4,-9}}, 7)));
	}
	
	public int[][] kClosest(int[][] points, int k) {
		PriorityQueue<Point> queue = new PriorityQueue<>((a, b) -> {
			return a.distance - b.distance;
		});
		
		for (int[] point : points) {
			int oDistance = (int)(Math.pow(point[0], 2) + Math.pow(point[1], 2));
			queue.offer(new Point(oDistance, point));
		}
		
		List<Point> temp = new ArrayList<>();
		int index = 0;
		while (!queue.isEmpty()) {
			index++;
			Point tempPoint = queue.poll();
			temp.add(tempPoint);
			if (index == k) {
				break;
			}
		}
		
		int[][] result = new int[temp.size()][2];
		for (int i = 0; i < result.length; i++) {
			result[i] = temp.get(i).point;
		}
		
		return result;
    }
	
	static class Point {
		private int distance;
		private int[] point;
		
		public Point(int distance, int[] point) {
			super();
			this.distance = distance;
			this.point = point;
		}

		public double getDistance() {
			return distance;
		}

		public void setDistance(int distance) {
			this.distance = distance;
		}

		public int[] getPoint() {
			return point;
		}

		public void setPoint(int[] point) {
			this.point = point;
		}

		@Override
		public String toString() {
			return "Point [distance=" + distance + ", point=" + Arrays.toString(point) + "]";
		}
		
	}
	
}
