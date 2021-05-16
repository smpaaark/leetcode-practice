package leetcode.sort;

/**
 * LeetCode
 * 1859. Sorting the Sentence
 */
public class Q1859 {

    public static void main(String[] args) {
        Q1859 q = new Q1859();
        System.out.println(q.sortSentence("is2 sentence4 This1 a3"));
    }

    public String sortSentence(String s) {
        String[] array = s.split(" ");
        String[] result = new String[array.length];
        for (String str : array) {
            int index = Integer.parseInt(str.charAt(str.length() - 1) + "");
            String word = str.substring(0, str.length() - 1);
            result[index - 1] = word;
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length - 1; i++) {
            sb.append(result[i] + " ");
        }

        sb.append(result[result.length - 1]);
        return sb.toString();
    }

}
