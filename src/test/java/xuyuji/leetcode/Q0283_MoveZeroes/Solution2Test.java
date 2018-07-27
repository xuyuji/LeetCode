package xuyuji.leetcode.Q0283_MoveZeroes;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class Solution2Test {

	private Solution2 solution;

	@Before
	public void setup() {
		solution = new Solution2();
	}

	@Test
	public void testMoveZeroes1() {
		int[] nums = new int[] { 0, 1, 0, 3, 12 };
		solution.moveZeroes(nums);
		assertArrayEquals(new int[] { 1, 3, 12, 0, 0 }, nums);
	}

	@Test
	public void testMoveZeroes2() {
		int[] nums = new int[] { 0, 0, 0, 0, 0 };
		solution.moveZeroes(nums);
		assertArrayEquals(new int[] { 0, 0, 0, 0, 0 }, nums);
	}

	@Test
	public void testMoveZeroes3() {
		int[] nums = new int[] { 0, 0, 1, 0, 0 };
		solution.moveZeroes(nums);
		assertArrayEquals(new int[] { 1, 0, 0, 0, 0 }, nums);
	}

	@Test
	public void testMoveZeroes4() {
		int[] nums = new int[] {};
		solution.moveZeroes(nums);
		assertArrayEquals(new int[] {}, nums);
	}
}
