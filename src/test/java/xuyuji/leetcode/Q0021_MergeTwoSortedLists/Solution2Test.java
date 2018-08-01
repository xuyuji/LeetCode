package xuyuji.leetcode.Q0021_MergeTwoSortedLists;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Solution2Test {

	private Solution2 solution;

	@Before
	public void setup() {
		solution = new Solution2();
	}

	@Test
	public void testMergeTwoLists1() {
		ListNode result = solution.mergeTwoLists(buildLinkedList(new int[] { 1, 2, 4 }),
				buildLinkedList(new int[] { 1, 3, 4 }));

		assertNotNull(result);
		assertTrue(result.isEquals(buildLinkedList(new int[] { 1, 1, 2, 3, 4, 4 })));
	}

	@Test
	public void testMergeTwoLists2() {
		ListNode result = solution.mergeTwoLists(buildLinkedList(new int[] { -9, 3 }),
				buildLinkedList(new int[] { 5, 7 }));

		assertNotNull(result);
		assertTrue(result.isEquals(buildLinkedList(new int[] { -9, 3, 5, 7 })));
	}

	private static ListNode buildLinkedList(int[] array) {
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
