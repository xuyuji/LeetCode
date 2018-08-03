package xuyuji.leetcode.Q0203_RemoveLinkedListElements;

import xuyuji.leetcode.common.linkedList.ListNode;

public class Solution2 {
	public ListNode removeElements(ListNode head, int val) {
		if (head == null)
			return null;
		head.next = removeElements(head.next, val);
		return head.val == val ? head.next : head;
	}
}
