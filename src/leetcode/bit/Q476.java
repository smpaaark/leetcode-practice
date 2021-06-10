package leetcode.bit;

/**
 * LeetCode
 * 476. Number Complement
 */
public class Q476 {

    public static void main(String[] args) {
        System.out.println(Integer.highestOneBit(5));
    }

    public int findComplement(int num) {
        return ~num & (Integer.highestOneBit(num) - 1);
    }

}
