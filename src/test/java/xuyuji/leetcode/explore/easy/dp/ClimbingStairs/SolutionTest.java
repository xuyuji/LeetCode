package xuyuji.leetcode.explore.easy.dp.ClimbingStairs;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setup() {
		solution = new Solution();
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
