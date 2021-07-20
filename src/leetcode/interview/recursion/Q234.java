package leetcode.interview.recursion;

/**
 * LeetCode
 * 234. Palindrome Linked List
 * Recursion
 */
public class Q234 {

    public boolean isPalindrome(ListNode head) {
        int length = 0;
        ListNode currentNode = head;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }

        ListNode backNode = null;
        int forLength = length % 2 > 0 ? length / 2 + 1 : length / 2;
        currentNode = head;
        for (int i = 0; i < forLength; i++) {
            backNode = currentNode.next;
            currentNode = currentNode.next;
        }

        ListNode frontNode = recursion(head, null, length / 2);
        for (int i = 0; i < length / 2; i++) {
            if (backNode.val != frontNode.val) {
                return false;
            }
            backNode = backNode.next;
            frontNode = frontNode.next;
        }

        return true;
    }

    private ListNode recursion(ListNode node, ListNode prevNode, int count) {
        if (count == 0) {
            return prevNode;
        }

        ListNode next = node.next;
        node.next = prevNode;
        return recursion(next, node, --count);
    }

    ListNode node;

    public boolean isPalindrome2(ListNode head) {
        if (head == null) { // 리스트의 끝까지 간 후 초기 결과 true로 세팅한다.
            return true;
        }

        if (node == null) { // head 노드를 저장해 둔다.
            node = head;
        }

        boolean bool = isPalindrome2(head.next); // 꼬리까지 간다. 꼬리까지 간 후 돌아왔을때 초기 bool은 true

        if (head.val == node.val) {    // 처음 head는 꼬리이며, node는 헤드이다. 값을 비교하여 같으면 node를 한칸 옮긴다.
            node = node.next;
        } else { // 같지 않으면 false를 리턴한다.
            bool = false;
        }

        return bool;
    }

    class ListNode {

        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }

}
