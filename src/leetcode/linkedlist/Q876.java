package leetcode.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class Q876 {

	public static void main(String[] args) {
		Q876 q = new Q876();
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		System.out.println(q.middleNode(head).val);
	}
	
	public ListNode middleNode(ListNode head) {
		Map<Integer, ListNode> map = new HashMap<>();
		int index = 0;
		
		ListNode currentNode = head;
		while (currentNode != null) {
			map.put(index++, currentNode);
			currentNode = currentNode.next;
		}
		
		return map.get(index / 2);
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

