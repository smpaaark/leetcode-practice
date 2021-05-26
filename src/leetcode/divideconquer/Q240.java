package leetcode.divideconquer;

/**
 * LeetCode
 * 240. Search a 2D Matrix II
 */
public class Q240 {

    public static void main(String[] args) {
        Q240 q = new Q240();
        System.out.println(q.searchMatrix(new int[][] {{-5}}, -10));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (matrix[m - 1][n - 1] < target) {
            return false;
        }

        int tempM = mSearch(matrix, target, 0, matrix.length - 1);
        if (tempM == -1) {
            return false;
        } else if (matrix[tempM][0] == target) {
            return true;
        } else if (matrix[tempM][0] > target) {
            tempM--;
        }

        return nSearch(matrix, target, tempM, 0, matrix[0].length - 1);
    }

    private boolean nSearch(int[][] matrix, int target, int tempM, int start, int end) {
        if (tempM < 0) {
            return false;
        } else if (start > end) {
            return nSearch(matrix, target, tempM - 1, 0, matrix[tempM].length - 1);
        }

        int mid = (start + end) / 2;

        if (target == matrix[tempM][mid]) {
            return true;
        } else if (target < matrix[tempM][mid]) {
            return nSearch(matrix, target, tempM, start, mid - 1);
        } else {
            return nSearch(matrix, target, tempM, mid + 1, end);
        }

    }

    private int mSearch(int[][] matrix, int target, int start, int end) {
        if (start > end) {
            return start;
        } else if (start == end) {
            return start;
        }

        int mid = (start + end) / 2;

        if (target == matrix[mid][0]) {
            return mid;
        } else if (target < matrix[mid][0]) {
            return mSearch(matrix, target, start, mid - 1);
        } else {
            return mSearch(matrix, target, mid + 1, end);
        }
    }

}
