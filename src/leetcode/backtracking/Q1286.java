package leetcode.backtracking;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode
 * 1286. Iterator for Combination
 */
public class Q1286 {

    public static void main(String[] args) {
        CombinationIterator obj = new CombinationIterator("abc", 2);
        System.out.println(obj);

        String str = "abc";
        int length = 2;
        for (int i = 0; i <= str.length() - length; i++) {
            backTracking2(i + 1, str.charAt(i) + "", length, str);
        }
    }

    private static void backTracking2(int index, String temp, int length, String str) {
        System.out.println("index: " + index);
        System.out.println("temp: " + temp);
        if (temp.length() == length) {
            System.out.println(temp);
            return;
        }

        for (int i = index; i < str.length(); i++) {
            backTracking2(i + 1, temp + str.charAt(i), length, str);
        }
    }

    static class CombinationIterator {

        private Queue<String> queue = new LinkedList<>();

        public CombinationIterator(String characters, int combinationLength) {
            for (int i = 0; i <= characters.length() - combinationLength; i++) {
                backtracking(i + 1, characters.charAt(i) + "", characters, combinationLength);
            }
        }

        private void backtracking(int startIndex, String temp, String characters, int combinationLength) {
            if (temp.length() == combinationLength) {
                queue.offer(temp);

                return;
            }

            for (int i = startIndex; i < characters.length(); i++) {
                backtracking(i + 1, temp + characters.charAt(i), characters, combinationLength);
            }
        }

        public String next() {
            return queue.poll();
        }


        public boolean hasNext() {
            return !queue.isEmpty();
        }

    }

}
