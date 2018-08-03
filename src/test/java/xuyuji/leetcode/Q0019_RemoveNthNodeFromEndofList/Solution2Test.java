package xuyuji.leetcode.Q0019_RemoveNthNodeFromEndofList;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import xuyuji.leetcode.common.linkedList.ListNode;

public class Solution2Test {

	private Solution2 solution;

	@Before
	public void setup() {
		solution = new Solution2();
	}

	@Test
	public void testRemoveNthFromEnd1() {
		ListNode listNode = solution.removeNthFromEnd(ListNode.valueOf(new int[] { 1, 2, 3, 4, 5 }), 1);
		assertNotNull(listNode);
		assertTrue(listNode.isEquals(ListNode.valueOf(new int[] { 1, 2, 3, 4 })));
	}

	@Test
	public void testRemoveNthFromEnd2() {
		ListNode listNode = solution.removeNthFromEnd(ListNode.valueOf(new int[] { 1, 2, 3, 4, 5 }), 3);
		assertNotNull(listNode);
		assertTrue(listNode.isEquals(ListNode.valueOf(new int[] { 1, 2, 4, 5 })));
	}

	@Test
	public void testRemoveNthFromEnd3() {
		ListNode listNode = solution.removeNthFromEnd(ListNode.valueOf(new int[] { 1, 2, 3, 4, 5 }), 5);
		assertNotNull(listNode);
		assertTrue(listNode.isEquals(ListNode.valueOf(new int[] { 2, 3, 4, 5 })));
	}

	@Test
	public void testRemoveNthFromEnd5() {
		ListNode listNode = solution.removeNthFromEnd(ListNode.valueOf(new int[] { 1 }), 1);
		assertNull(listNode);
	}
}
