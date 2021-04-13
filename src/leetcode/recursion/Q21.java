package leetcode.recursion;

public class Q21 {

	public static void main(String[] args) {
		Q21 q = new Q21();
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		ListNode newNode = q.mergeTwoLists(l1, l2);
		
		ListNode currentNode = newNode;
		while (currentNode != null) {
			System.out.print(currentNode.val + " ");
			currentNode = currentNode.next;
		}
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return null;
		}
		
		ListNode newNode = new ListNode(101);
		recursion(l1, l2, newNode);
		
		return newNode.next;
    }

	private void recursion(ListNode l1, ListNode l2, ListNode newNode) {
		if (l1 == null && l2 == null) {
			return;
		} 
		
		ListNode temp1 = null;
		ListNode temp2 = null;
		if (l1 != null && l2 == null) {
			newNode.next = new ListNode(l1.val);
			temp1 = l1.next;
		} else if (l1 == null && l2 != null) {
			newNode.next = new ListNode(l2.val);
			temp2 = l2.next;
		} else {
			if (l1.val < l2.val) {
				newNode.next = new ListNode(l1.val);
				temp1 = l1.next;
				temp2 = l2;
			} else {
				newNode.next = new ListNode(l2.val);
				temp1 = l1;
				temp2 = l2.next;
			}
		}
		
		recursion(temp1, temp2, newNode.next);
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
