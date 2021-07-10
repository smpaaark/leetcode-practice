package leetcode.interview;

/**
 * LeetCode
 * 171. Excel Sheet Column Number
 */
public class Q171 {

    public static void main(String[] args) {
        Q171 q = new Q171();
        char c = 'A';
        System.out.println((int) ('A'));
        System.out.println((int) ('B'));
        System.out.println((int) (c - 'B'));
//        System.out.println(q.titleToNumber("A"));
    }

    public int titleToNumber(String columnTitle) {
        int length = columnTitle.length();
        int result = 0;
        for (char c : columnTitle.toCharArray()) {
            result += (int) (Math.pow(26, length-- - 1) * ((int) (c - 'A') + 1));
        }

        return result;
    }

}
