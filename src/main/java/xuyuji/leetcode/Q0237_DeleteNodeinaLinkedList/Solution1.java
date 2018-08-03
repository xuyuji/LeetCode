package xuyuji.leetcode.Q0237_DeleteNodeinaLinkedList;

import xuyuji.leetcode.common.linkedList.ListNode;

public class Solution1 {
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
