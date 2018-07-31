package xuyuji.leetcode.Q0125_ValidPalindrome;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Solution1Test {

	private Solution1 solution;

	@Before
	public void setup() {
		solution = new Solution1();
	}

	@Test
	public void testIsPalindrome1() {
		assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
	}

	@Test
	public void testIsPalindrome2() {
		assertFalse(solution.isPalindrome("race a car"));
	}

	@Test
	public void testIsPalindrome3() {
		assertTrue(solution.isPalindrome(".,"));
	}
}
