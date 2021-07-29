package leetcode.interview.divideconquer;

/**
 * LeetCode
 * 108. Convert Sorted Array to Binary Search Tree
 * Divide and Conquer
 */
public class Q108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        return divideAndConquer(nums, 0, nums.length - 1);
    }

    private TreeNode divideAndConquer(int[] nums, int start, int end) {
        if (start > end) { // start가 더 크면 null
            return null;
        }

        int mid = (start + end) / 2; // 중간 index
        TreeNode node = new TreeNode(nums[mid]); // 중간 index의 값을 node로 생성
        node.left = divideAndConquer(nums, start, mid -1); // 분할하면서 왼쪽 결과를 left에 저장
        node.right = divideAndConquer(nums, mid + 1, end); // 분할하면서 오른쪽 결과를 right에 저장

        return node;
    }

    class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) { this.val = val; }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

}
