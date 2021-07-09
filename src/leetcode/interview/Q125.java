package leetcode.interview;

/**
 * LeetCode
 * 125. Valid Palindrome
 */
public class Q125 {

    public static void main(String[] args) {
        String s = "1";
        System.out.println(s.toLowerCase());
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int frontIndex = 0;
        int tailIndex = s.length() - 1;
        char[] array = s.toCharArray();
        while (frontIndex < tailIndex) {
            if (!((array[frontIndex] >= '0' && array[frontIndex] <= '9') || (array[frontIndex] >= 'a' && array[frontIndex] <= 'z'))) {
                frontIndex++;
                continue;
            }

            if (!((array[tailIndex] >= '0' && array[tailIndex] <= '9') || (array[tailIndex] >= 'a' && array[tailIndex] <= 'z'))) {
                tailIndex--;
                continue;
            }

            if (array[frontIndex] != array[tailIndex]) {
                return false;
            }

            frontIndex++;
            tailIndex--;
        }

        return true;
    }

}
