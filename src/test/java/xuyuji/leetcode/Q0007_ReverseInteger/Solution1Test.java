package xuyuji.leetcode.Q0007_ReverseInteger;

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
	public void testReverse1() {
		assertEquals(123, solution.reverse(321));
	}

	@Test
	public void testReverse2() {
		assertEquals(-123, solution.reverse(-321));
	}

	@Test
	public void testReverse3() {
		assertEquals(0, solution.reverse(1534236469));
	}
}
