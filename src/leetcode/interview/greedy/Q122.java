package leetcode.interview.greedy;

/**
 * LeetCode
 * 122. Best Time to Buy and Sell Stock II
 * Greedy
 */
public class Q122 {

    public int maxProfit(int[] prices) {
        int result = 0;
        int i = 0;

        while (i < prices.length) {
            // 가격이 오르기 시작하는 날 찾기
            while (i < prices.length-1 && prices[i+1] <= prices[i]) {
                i++;
            }

            // 가격이 오르기 시작하는 날의 가격 저장
            int min = prices[i++];

            // 가격이 떨어지는 날 찾기
            while (i < prices.length-1 && prices[i+1] >= prices[i]) {
                i++;
            }
            
            result += i < prices.length ? prices[i++] - min : 0;
        }
        return result;
    }

}
