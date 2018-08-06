package xuyuji.leetcode.Q0141_LinkedListCycle;

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
	public void testHasCycle1() {
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		head.next = node1;
		node1.next = node2;
		node2.next = head;
		assertTrue(solution.hasCycle(head));
	}

}
