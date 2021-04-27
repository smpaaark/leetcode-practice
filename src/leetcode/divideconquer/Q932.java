package leetcode.divideconquer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode
 * 932. Beautiful Array
 * 시간 복잡도: O(nlogn)
 * 공간 복잡도: O(nlogn)
 */
public class Q932 {

    Map<Integer, int[]> memo;

    public static void main(String[] args) {
        Q932 q = new Q932();
        int[] result = q.beautifulArray(4);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public int[] beautifulArray(int N) {
        if (N == 1) {
            return new int[]{1};
        } else if (N == 2) {
            return new int[]{1, 2};
        } else {
            memo = new HashMap<>();
            memo.put(1, new int[]{1});
            memo.put(2, new int[]{1, 2});
        }

        return f(N);
    }

    public int[] f(int N) {
        if (memo.containsKey(N))
            return memo.get(N);

        int[] ans = new int[N];

        int index = 0;
        for (int num : f((N + 1) / 2)) {  // odds
            ans[index++] = 2 * num - 1;
        }

        for (int num : f(N / 2)) { // evens
            ans[index++] = 2 * num;
        }

        memo.put(N, ans);
        return ans;
    }

}
