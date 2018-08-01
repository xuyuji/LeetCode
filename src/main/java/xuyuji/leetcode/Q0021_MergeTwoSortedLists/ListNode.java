package xuyuji.leetcode.Q0021_MergeTwoSortedLists;

public class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	public boolean isEquals(ListNode ohter) {
		return isEquals(this, ohter);
	}

	private boolean isEquals(ListNode l1, ListNode l2) {
		if (l1 == null && l2 != null) {
			return false;
		}

		if (l1 != null && l2 == null) {
			return false;
		}

		if (l1 == null && l2 == null) {
			return true;
		}

		if (l1.val == l2.val) {
			return isEquals(l1.next, l2.next);
		} else {
			return false;
		}
	}
}
