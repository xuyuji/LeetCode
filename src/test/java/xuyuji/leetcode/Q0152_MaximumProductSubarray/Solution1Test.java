package xuyuji.leetcode.Q0152_MaximumProductSubarray;

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
	public void testMaxProduct1() {
		assertEquals(6, solution.maxProduct(new int[] { 2, 3, -2, 4 }));
	}

	@Test
	public void testMaxProduct2() {
		assertEquals(0, solution.maxProduct(new int[] { -2, 0, -1 }));
	}

	@Test
	public void testMaxProduct3() {
		assertEquals(12, solution.maxProduct(new int[] { -4, -3 }));
	}

	@Test
	public void testMaxProduct4() {
		assertEquals(-2, solution.maxProduct(new int[] { -2 }));
	}
}
