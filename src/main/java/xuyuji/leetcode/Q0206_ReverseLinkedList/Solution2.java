package xuyuji.leetcode.Q0206_ReverseLinkedList;

public class Solution2 {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		} else {
			ListNode node = reverseList(head.next);
			head.next.next = head;
			head.next = null;
			return node;
		}
	}
}
