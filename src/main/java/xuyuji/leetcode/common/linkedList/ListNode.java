package xuyuji.leetcode.common.linkedList;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
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

	public static ListNode valueOf(int[] array) {
		ListNode head = new ListNode(array[0]);
		ListNode pre = head;
		ListNode node;
		for (int i = 1; i < array.length; i++) {
			node = new ListNode(array[i]);
			pre.next = node;
			pre = node;
		}
		return head;
	}
}
