package xuyuji.leetcode.Q0070_ClimbingStairs;

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
	public void testClimbStairs1() {
		assertEquals(2, solution.climbStairs(2));
	}

	@Test
	public void testClimbStairs2() {
		assertEquals(3, solution.climbStairs(3));
	}

	@Test
	public void testClimbStairs3() {
		assertEquals(1134903170, solution.climbStairs(44));
	}
}
