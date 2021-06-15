package leetcode.string;

/**
 * LeetCode
 * 709. To Lower Case
 */
public class Q709 {

    public static void main(String[] args) {
        int c1 = 'a';
        int c2 = 'A';
        int c3 = 32;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println((char)c3);
    }

    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int cInt = c;
            if ((int)'A' <= cInt && cInt <= (int)'Z') {
                int space = ' ';
                c = (char)(cInt + space);
            }
            sb.append(c);
        }

        return sb.toString();
    }

}
