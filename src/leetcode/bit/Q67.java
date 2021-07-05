package leetcode.bit;

/**
 * LeetCode
 * 67. Add Binary
 */
public class Q67 {

    public static void main(String[] args) {
        Q67 q =  new Q67();
        System.out.println(q.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }

    public String addBinary(String a, String b) {
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        StringBuilder sb = new StringBuilder();
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        int plus = 0;
        while (aIndex >= 0 || bIndex >= 0) {
            char aNum = aIndex >= 0 ? aArray[aIndex--] : '0';
            char bNum = bIndex >= 0 ? bArray[bIndex--] : '0';

            if (aNum == '1' && bNum == '1') {
                sb.append(plus == 0 ? "0" : "1");
                plus = 1;
            } else if (aNum == '0' && bNum == '0') {
                sb.append(plus == 0 ? "0" : "1");
                plus = 0;
            } else {
                sb.append(plus == 0 ? "1" : "0");
            }
        }

        if (plus == 1) {
            sb.append('1');
        }

        return sb.reverse().toString();
    }

}
