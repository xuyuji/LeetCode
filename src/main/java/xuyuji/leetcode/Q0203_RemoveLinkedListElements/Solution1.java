package xuyuji.leetcode.Q0203_RemoveLinkedListElements;

import xuyuji.leetcode.common.linkedList.ListNode;

public class Solution1 {
	public ListNode removeElements(ListNode head, int val) {
		ListNode virtualHead = new ListNode(0);
		virtualHead.next = head;

		ListNode pre = virtualHead;
		while (head != null) {
			if (head.val == val) {
				pre.next = head.next;
			} else {
				pre = head;
			}
			head = head.next;
		}

		return virtualHead.next;
	}
}
