package leetcode.interview;

/**
 * LeetCode
 * 28. Implement strStr()
 */
public class Q28 {

    public static void main(String[] args) {
        Q28 q = new Q28();
        System.out.println(q.strStr("a", "a"));
    }

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        int resultIndex = -1;
        int needleLength = needle.length();
        char[] hArray = haystack.toCharArray();
        char[] nArray = needle.toCharArray();
        for (int i = 0; i <= hArray.length - needleLength; i++) {
            if (hArray[i] == nArray[0]) {
                resultIndex = i;
                for (int j = 1; j < needleLength; j++) {
                    if (hArray[i + j] != nArray[j]) {
                        resultIndex = -1;
                        break;
                    }
                }

                if (resultIndex != -1) {
                    return resultIndex;
                }
            }
        }

        return resultIndex;
    }

}
