package leetcode.linkedlist;

public class Q206 {
	
	public static void main(String[] args) {
		Q206 q = new Q206();
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode reverseNode = q.reverseList(head);
		
		while (reverseNode != null) {
			System.out.print(reverseNode.val);
			reverseNode = reverseNode.next;
		}
	}
	
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		
        ListNode currentNode = head;
        ListNode prevNode = null;
        ListNode nextNode = null;
        while (currentNode.next != null) {
        	nextNode = currentNode.next;
        	currentNode.next = prevNode;
        	prevNode = currentNode;
        	currentNode = nextNode;
        }
        
        currentNode.next = prevNode;
        head = currentNode;
        
        return head;
    }
	
	static class ListNode {
	    int val;
	    ListNode next;
	    
	    ListNode() {
	    	
	    }
	    
	    ListNode(int val) {
	    	this.val = val;
	    }
	    
	    ListNode(int val, ListNode next) {
	    	this.val = val; this.next = next;
	    }
	    
	}
}
