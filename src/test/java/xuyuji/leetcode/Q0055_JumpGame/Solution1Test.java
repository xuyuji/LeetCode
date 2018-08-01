package xuyuji.leetcode.Q0055_JumpGame;

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
	public void testCanJump1() {
		assertTrue(solution.canJump(new int[] { 2, 3, 1, 1, 4 }));
	}

	@Test
	public void testCanJump2() {
		assertFalse(solution.canJump(new int[] { 3, 2, 1, 0, 4 }));
	}

	@Test
	public void testCanJump3() {
		assertFalse(solution.canJump(new int[] { 0, 1 }));
	}

	@Test
	public void testCanJump4() {
		assertTrue(solution.canJump(new int[] { 0 }));
	}

	@Test
	public void testCanJump5() {
		assertTrue(solution.canJump(new int[] { 1, 1, 1, 1, 0 }));
	}

	@Test
	public void testCanJump6() {
		assertFalse(solution.canJump(new int[] { 0, 2, 3 }));
	}
}
