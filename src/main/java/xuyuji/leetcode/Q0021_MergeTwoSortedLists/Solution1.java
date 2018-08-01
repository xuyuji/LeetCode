package xuyuji.leetcode.Q0021_MergeTwoSortedLists;

public class Solution1 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}

		ListNode result;
		ListNode n1;
		ListNode n2;
		if (l1.val > l2.val) {
			result = n1 = l2;
			n2 = l1;
		} else {
			result = n1 = l1;
			n2 = l2;
		}

		ListNode pre = n1;
		while (n2 != null) {
			while (n1 != null && n1.val <= n2.val) {
				pre = n1;
				n1 = n1.next;
			}

			ListNode node = new ListNode(n2.val);
			pre.next = node;
			node.next = n1;
			pre = node;

			n2 = n2.next;
		}

		return result;
	}
}
