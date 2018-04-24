package xuyuji.leetcode.Q0002_AddTwoNumbers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Solution1Test {

	private Solution1 solution;

	@Before
	public void setup() {
		solution = new Solution1();
	}

	@Test
	public void testTwoSum() {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		ListNode result = solution.addTwoNumbers(l1, l2);
		assertEquals(7L, result.val);
		assertEquals(0L, result.next.val);
		assertEquals(8L, result.next.next.val);
	}
}
