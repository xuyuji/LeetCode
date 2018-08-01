package xuyuji.leetcode.Q0206_ReverseLinkedList;

public class Solution1 {
	public ListNode reverseList(ListNode head) {
		ListNode preNode = null;
		ListNode node = head;
		ListNode nextNode;
		while (node != null) {
			nextNode = node.next;
			node.next = preNode;
			preNode = node;
			node = nextNode;
		}
		return preNode;
	}
}
