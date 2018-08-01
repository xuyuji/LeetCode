package xuyuji.leetcode.Q0206_ReverseLinkedList;

import static org.junit.Assert.assertNotNull;
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
	public void testReverseList1() {
		ListNode listNode = solution.reverseList(ListNode.valueOf(new int[] { 1, 2, 3, 4, 5 }));
		assertNotNull(listNode);
		assertTrue(listNode.isEquals(ListNode.valueOf(new int[] { 5, 4, 3, 2, 1 })));
	}
}
