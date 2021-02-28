package leetcode.linkedlist;

public class Q1290 {
	
	public static void main(String[] args) {
		Q1290 q = new Q1290();
		ListNode head = new ListNode(0);
		head.next = new ListNode(0);
//		head.next.next = new ListNode(0);
//		head.next.next.next = new ListNode(0);
		System.out.println(q.getDecimalValue_other(head));
	}

	public int getDecimalValue(ListNode head) {
		int size = 0;
		ListNode currentNode = head;
		while (currentNode != null) {
			size++;
			currentNode = currentNode.next;
		}
		
		int result = 0;
		currentNode = head;
		while (currentNode != null) {
			size--;
			if (currentNode.val == 1) {
				result += Math.pow(2, size);
			}
			
			currentNode = currentNode.next;
		}
		
		return result;
	}
	
	public int getDecimalValue_other(ListNode head) {
		ListNode currentNode = head;
		StringBuilder sb = new StringBuilder();
		while (currentNode != null) {
			sb.append(currentNode.val);
			currentNode = currentNode.next;
		}
		
		return Integer.parseInt(sb.toString(), 2);
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
	    	this.val = val;
	    	this.next = next;
	    }
	    
	}
	
}
 