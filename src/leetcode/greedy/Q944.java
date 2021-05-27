package leetcode.greedy;

/**
 * LeetCode
 * 944. Delete Columns to Make Sorted
 */
public class Q944 {

    public int minDeletionSize(String[] strs) {
        int removeCount = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                int prev = strs[j - 1].charAt(i);
                int current = strs[j].charAt(i);
                if (prev > current) {
                    removeCount++;
                    break;
                }
            }
        }

        return removeCount;
    }

}
