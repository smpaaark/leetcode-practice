package leetcode.linkedlist;

public class Q237 {
	
	public static void main(String[] args) {
		Q237 q = new Q237();
		ListNode head = new ListNode(4);
		head.next = new ListNode(5);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(9);
		
		q.deleteNode(head.next.next);
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
	
	public void deleteNode(ListNode node) {
    	node.val = node.next.val;
    	node.next = node.next.next;
    }
	
	static class ListNode {
		
	    int val;
	    ListNode next;
	    
	    ListNode(int x) {
	    	val = x;
	    }
	    
	}
}
