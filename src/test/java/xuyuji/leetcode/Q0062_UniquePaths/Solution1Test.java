package xuyuji.leetcode.Q0062_UniquePaths;

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
	public void testUniquePaths1() {
		assertEquals(3, solution.uniquePaths(3, 2));
	}

	@Test
	public void testUniquePaths2() {
		assertEquals(28, solution.uniquePaths(7, 3));
	}

	@Test(timeout = 100)
	public void testUniquePaths3() {
		assertEquals(985525432, solution.uniquePaths(20, 20));
	}
}
