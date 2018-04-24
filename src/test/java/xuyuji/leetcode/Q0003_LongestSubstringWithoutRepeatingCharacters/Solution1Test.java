package xuyuji.leetcode.Q0003_LongestSubstringWithoutRepeatingCharacters;

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
	public void testLengthOfLongestSubstring1() {
		assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
	}

	@Test
	public void testLengthOfLongestSubstring2() {
		assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
	}

	@Test
	public void testLengthOfLongestSubstring3() {
		assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
	}
}
