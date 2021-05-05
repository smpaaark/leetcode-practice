package leetcode.heap;

import java.util.PriorityQueue;

/**
 * LeetCode
 * 1753. Maximum Score From Removing Stones
 */
public class Q1753 {

    public static void main(String[] args) {
        Q1753 q = new Q1753();
        System.out.println(q.maximumScore(2, 4, 6));
    }

    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((num1, num2) -> {
            return num2 - num1;
        });

        maxHeap.offer(a);
        maxHeap.offer(b);
        maxHeap.offer(c);

        int result = 0;
        while (maxHeap.size() > 1) {
            result++;
            int num1 = maxHeap.poll() - 1;
            int num2 = maxHeap.poll() - 1;
            if (num1 > 0) {
                maxHeap.offer(num1);
            }

            if (num2 > 0) {
                maxHeap.offer(num2);
            }
        }

        return result;
    }

}
