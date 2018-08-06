package xuyuji.leetcode.Q0141_LinkedListCycle;

import xuyuji.leetcode.common.linkedList.ListNode;

public class Solution2 {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}

		ListNode fast = head.next.next;
		ListNode slow = head.next;
		while (fast != slow) {
			if (fast == null || fast.next == null) {
				return false;
			}

			fast = fast.next.next;
			slow = slow.next;
		}

		return true;
	}
}
