package leetcode.interview.string;

/**
 * LeetCode
 * 28. Implement strStr()
 * String
 */
public class Q28 {

    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            for (int needleIndex = 0; needleIndex <= needle.length(); needleIndex++) {
                if (needleIndex == needle.length()) {
                    return i;
                }

                if (needle.charAt(needleIndex) != haystack.charAt(i + needleIndex)) {
                    break;
                }
            }
        }

        return -1;
    }

}
