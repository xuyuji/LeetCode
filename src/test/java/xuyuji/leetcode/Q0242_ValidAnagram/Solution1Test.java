package xuyuji.leetcode.Q0242_ValidAnagram;

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
	public void testIsAnagram1() {
		assertTrue(solution.isAnagram("anagram", "nagaram"));
	}

	@Test
	public void testIsAnagram2() {
		assertFalse(solution.isAnagram("rat", "cat"));
	}
}
