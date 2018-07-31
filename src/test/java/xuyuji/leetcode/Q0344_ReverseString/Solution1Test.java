package xuyuji.leetcode.Q0344_ReverseString;

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
	public void testReverseString1() {
		assertEquals("olleh", solution.reverseString("hello"));
	}
}
