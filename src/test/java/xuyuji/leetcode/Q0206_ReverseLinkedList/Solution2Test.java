package xuyuji.leetcode.Q0206_ReverseLinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class Solution2Test {

	private Solution2 solution;

	@Before
	public void setup() {
		solution = new Solution2();
	}

	@Test
	public void testReverseList1() {
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode4 = new ListNode(4);
		ListNode listNode5 = new ListNode(5);

		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = listNode5;

		// 输入:NULL 1->2->3->4->5->NULL
		// 输出: 5->4->3->2->1->NULL
		ListNode listNode = solution.reverseList(listNode1);
		assertNotNull(listNode);
		assertEquals(5, listNode.val);

		listNode = listNode.next;
		assertNotNull(listNode);
		assertEquals(4, listNode.val);

		listNode = listNode.next;
		assertNotNull(listNode);
		assertEquals(3, listNode.val);

		listNode = listNode.next;
		assertNotNull(listNode);
		assertEquals(2, listNode.val);

		listNode = listNode.next;
		assertNotNull(listNode);
		assertEquals(1, listNode.val);

		listNode = listNode.next;
		assertNull(listNode);
	}
}
