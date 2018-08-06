package xuyuji.leetcode.Q0141_LinkedListCycle;

import java.util.HashSet;
import java.util.Set;

import xuyuji.leetcode.common.linkedList.ListNode;

public class Solution1 {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}

		Set<ListNode> set = new HashSet<>();
		while (head != null) {
			if (set.contains(head)) {
				return true;
			} else {
				set.add(head);
			}
			head = head.next;
		}

		return false;
	}
}
