package xuyuji.leetcode.Q0237_DeleteNodeinaLinkedList;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import xuyuji.leetcode.common.linkedList.ListNode;

public class Solution1Test {

	private Solution1 solution;

	@Before
	public void setup() {
		solution = new Solution1();
	}

	@Test
	public void testDeleteNode1() {
		ListNode listNode = ListNode.valueOf(new int[] { 4, 5, 1, 9 });

		solution.deleteNode(listNode.next);

		assertNotNull(listNode);
		assertTrue(listNode.isEquals(ListNode.valueOf(new int[] { 4, 1, 9 })));
	}

	@Test
	public void testDeleteNode2() {
		ListNode listNode = ListNode.valueOf(new int[] { 4, 5, 1, 9 });

		solution.deleteNode(listNode.next.next);

		assertNotNull(listNode);
		assertTrue(listNode.isEquals(ListNode.valueOf(new int[] { 4, 5, 9 })));
	}

}
