package xuyuji.leetcode.Q0203_RemoveLinkedListElements;

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
	public void testRemoveElements1() {
		ListNode listNode = solution.removeElements(ListNode.valueOf(new int[] { 1, 2, 6, 3, 4, 5, 6 }), 6);
		assertNotNull(listNode);
		assertTrue(listNode.isEquals(ListNode.valueOf(new int[] { 1, 2, 3, 4, 5 })));
	}

}
