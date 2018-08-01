package xuyuji.leetcode.Q0021_MergeTwoSortedLists;

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
	public void testMergeTwoLists1() {
		ListNode result = solution.mergeTwoLists(ListNode.valueOf(new int[] { 1, 2, 4 }),
				ListNode.valueOf(new int[] { 1, 3, 4 }));

		assertNotNull(result);
		assertTrue(result.isEquals(ListNode.valueOf((new int[] { 1, 1, 2, 3, 4, 4 }))));
	}

	@Test
	public void testMergeTwoLists2() {
		ListNode result = solution.mergeTwoLists(ListNode.valueOf(new int[] { -9, 3 }),
				ListNode.valueOf(new int[] { 5, 7 }));

		assertNotNull(result);
		assertTrue(result.isEquals(ListNode.valueOf((new int[] { -9, 3, 5, 7 }))));
	}
}
