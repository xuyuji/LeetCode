package xuyuji.leetcode.Q0028_ImplementStrStr;

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
	public void testStrStr1() {
		assertEquals(2, solution.strStr("hello", "ll"));
	}

	@Test
	public void testStrStr2() {
		assertEquals(-1, solution.strStr("aaaaa", "bba"));
	}

	@Test
	public void testStrStr3() {
		assertEquals(0, solution.strStr("a", "a"));
	}

	@Test
	public void testStrStr4() {
		assertEquals(4, solution.strStr("mississippi", "issip"));
	}
}
