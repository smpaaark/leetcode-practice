package leetcode.linkedlist;

public class Q21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) { // l1 == null이면 l2 리턴
            return l2;
        }

        if (l2 == null) { // l2 == null이면 l1 리턴
            return l1;
        }

        ListNode tempHead = new ListNode();
        ListNode currentNode = tempHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) { // l1보다 l2가 크면 다음 노드는 l1이 되고, l1은 다음 노드로 넘어간다.
                currentNode.next = l1;
                l1 = l1.next;
            } else { // l2보다 l1이 크거나 같으면 다음 노드는 l2이 되고, l2는 다음 노드로 넘어간다.
                currentNode.next = l2;
                l2 = l2.next;
            }

            currentNode = currentNode.next; // 현재 노드 다음 노드로 변경한다.
        }

        // l1과 l2중 하나가 null이 아닐 경우 다음 노드를 null이 아닌 노드를 가리키게 하면 된다.
        if (l1 != null) {
            currentNode.next = l1;
        } else if (l2 != null){
            currentNode.next = l2;
        }

        return tempHead.next;
    }

    class ListNode {

        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }

}
