package leetcode.string;

/**
 * LeetCode
 * 1880. Check if Word Equals Summation of Two Words
 */
public class Q1880 {

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstNum = getIntegerNum(firstWord);
        int secondNum = getIntegerNum(secondWord);
        int targetNum = getIntegerNum(targetWord);

        return firstNum + secondNum == targetNum;
    }

    private Integer getIntegerNum(String string) {
        String temp = "";
        for (char c : string.toCharArray()) {
            int cNum = c - 'a';
            temp += cNum;
        }
        return Integer.parseInt(temp);
    }

}
