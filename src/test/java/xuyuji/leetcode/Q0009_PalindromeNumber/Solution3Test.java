package xuyuji.leetcode.Q0009_PalindromeNumber;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Solution3Test {

	private Solution3 solution;

	@Before
	public void setup() {
		solution = new Solution3();
	}

	@Test
	public void testIsPalindrome1() {
		assertTrue(solution.isPalindrome(121));
	}

	@Test
	public void testIsPalindrome2() {
		assertFalse(solution.isPalindrome(-121));
	}

	@Test
	public void testIsPalindrome3() {
		assertFalse(solution.isPalindrome(10));
	}
}
