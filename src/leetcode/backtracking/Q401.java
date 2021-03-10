package leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q401 {
	
	private int[] binaryWatch = {1, 2, 4, 8, 1, 2, 4, 8, 16, 32};
	
	public static void main(String[] args) {
		Q401 q = new Q401();
		List<String> resultList = q.readBinaryWatch(2);
		Collections.sort(resultList);
		System.out.println(Arrays.toString(resultList.toArray()));
	}
	
	public List<String> readBinaryWatch(int num) {
		List<String> resultList = new ArrayList<>();
		backTracking(0, 0, num, 0, 0, resultList);
		return resultList;
    }

	private void backTracking(int index, int count, int num, int hour, int minute, List<String> resultList) {	
		if (count == num) {
			if (hour < 12 && minute < 60) {
				addList(hour, minute, resultList);
			}
			return;
		}
		
		for (int i = index; i < binaryWatch.length; i++) {
			if (i <= 3) {
				backTracking(i + 1, count + 1, num, hour + binaryWatch[i], minute, resultList);
			} else {
				backTracking(i + 1, count + 1, num, hour, minute + binaryWatch[i], resultList);
			}
		}
	}

	private void addList(int hour, int minute, List<String> resultList) {
		StringBuilder sb = new StringBuilder();
		sb.append(hour);
		sb.append(":");
		sb.append(minute < 10 ? "0" + minute : minute);
		resultList.add(sb.toString());
	}
	
}
