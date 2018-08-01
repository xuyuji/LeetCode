package xuyuji.leetcode.Q0002_AddTwoNumbers;

import xuyuji.leetcode.common.linkedList.ListNode;

public class Solution1 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = null;

		ListNode listNodeNew = null;
		ListNode listNode1 = l1;
		ListNode listNode2 = l2;

		int carry = 0;
		while (listNode1 != null || listNode2 != null) {
			int val1 = listNode1 == null ? 0 : listNode1.val;
			int val2 = listNode2 == null ? 0 : listNode2.val;
			int sum = val1 + val2 + carry;
			carry = sum / 10;
			if (result == null) {
				result = listNodeNew = new ListNode(sum % 10);
			} else {
				listNodeNew.next = new ListNode(sum % 10);
				listNodeNew = listNodeNew.next;
			}

			if (listNode1 != null) {
				listNode1 = listNode1.next;
			}
			if (listNode2 != null) {
				listNode2 = listNode2.next;
			}
		}
		if (carry > 0) {
			listNodeNew.next = new ListNode(carry);
		}

		return result;
	}
}