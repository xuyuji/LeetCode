package xuyuji.leetcode.Q0019_RemoveNthNodeFromEndofList;

import xuyuji.leetcode.common.linkedList.ListNode;

public class Solution2 {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode virtualNode = new ListNode(0);
		virtualNode.next = head;

		ListNode n1 = virtualNode;
		ListNode n2 = virtualNode;

		while (n1 != null && n >= 0) {
			n1 = n1.next;
			n--;
		}

		while (n1 != null) {
			n1 = n1.next;
			n2 = n2.next;
		}

		n2.next = n2.next.next;

		return virtualNode.next;
	}
}
