package xuyuji.leetcode.Q0234_PalindromeLinkedList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import xuyuji.leetcode.common.FileData;
import xuyuji.leetcode.common.linkedList.ListNode;

public class Solution2Test {

	private Solution2 solution;

	@Before
	public void setup() {
		solution = new Solution2();
	}

	@Test
	public void testIsPalindrome1() {
		assertTrue(solution.isPalindrome(ListNode.valueOf(new int[] { 1 })));
	}

	@Test
	public void testIsPalindrome2() {
		assertFalse(solution.isPalindrome(ListNode.valueOf(new int[] { 1, 2 })));
	}

	@Test
	public void testIsPalindrome3() {
		assertTrue(solution.isPalindrome(ListNode.valueOf(new int[] { 1, 2, 2, 1 })));
	}

	@Test
	public void testIsPalindrome4() {
		assertTrue(solution.isPalindrome(ListNode.valueOf(new int[] { 1, 2, 1 })));
	}

	@Test
	public void testIsPalindrome5() {
		assertTrue(solution.isPalindrome(ListNode.valueOf(new int[] { -129, -129 })));
	}

	@Test
	public void testIsPalindrome6() {
		assertFalse(solution.isPalindrome(ListNode.valueOf(
				FileData.readArray("src\\main\\resources\\xuyuji\\leetcode\\Q0234_PalindromeLinkedList\\data.txt"))));
	}

}
