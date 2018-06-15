package xuyuji.leetcode.Q0014_LongestCommonPrefix;

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
	public void testLongestCommonPrefix1() {
		assertEquals("fl", solution.longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
	}
}
