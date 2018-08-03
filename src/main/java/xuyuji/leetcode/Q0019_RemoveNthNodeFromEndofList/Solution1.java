package xuyuji.leetcode.Q0019_RemoveNthNodeFromEndofList;

import xuyuji.leetcode.common.linkedList.ListNode;

public class Solution1 {
	private int num;

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode virtualNode = new ListNode(0);
		virtualNode.next = head;

		num = n;
		removeNthFromEnd(virtualNode);

		return virtualNode.next;
	}

	private int removeNthFromEnd(ListNode head) {
		if (head == null) {
			return 0;
		}

		int n = removeNthFromEnd(head.next);
		if (n == num) {
			head.next = head.next.next;
		}
		return n + 1;
	}
}
