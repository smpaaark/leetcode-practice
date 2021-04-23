package leetcode.dfs;

public class Q108 {
	
	public static void main(String[] args) {
		Q108 q = new Q108();
		TreeNode head = q.sortedArrayToBST(new int[] {-10,-3,0,5,9});
		System.out.println(head);
	}
	
	public TreeNode sortedArrayToBST(int[] nums) {
		int middleIndex = (nums.length - 1) / 2;
		TreeNode headNode = new TreeNode(nums[middleIndex]);
		
		headNode.left = dfs(0, middleIndex - 1, nums);
		headNode.right = dfs(middleIndex + 1, nums.length - 1, nums);
		
        return headNode;
    }
	

	private TreeNode dfs(int startIndex, int endIndex, int[] nums) {
		if (startIndex > endIndex) {
			return null;
		}
		
		int middleIndex = (startIndex + endIndex) / 2;
		
		TreeNode node = new TreeNode(nums[middleIndex]);
		node.left = dfs(startIndex, middleIndex - 1, nums);
		node.right = dfs(middleIndex + 1, endIndex, nums);
        
        return node;
	}

	public class TreeNode {
		
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
