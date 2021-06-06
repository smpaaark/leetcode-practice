package leetcode.sort;

import java.util.Arrays;

/**
 * LeetCode
 * 1491. Average Salary Excluding the Minimum and Maximum Salary
 */
public class Q1491 {

    public static void main(String[] args) {
        Q1491 q = new Q1491();
        System.out.println(q.average(new int[] {4000,3000,1000,2000}));
    }

    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        }

        return sum / (salary.length - 2);
    }

}
