package xuyuji.leetcode.Q0048_RotateImage;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class Solution1Test {

	private Solution1 solution;

	@Before
	public void setup() {
		solution = new Solution1();
	}

	@Test
	public void testRotate1() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		solution.rotate(matrix);
		assertArrayEquals(new int[][] { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } }, matrix);
	}

	@Test
	public void testRotate2() {
		int[][] matrix = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
		solution.rotate(matrix);
		assertArrayEquals(new int[][] { { 15, 13, 2, 5 }, { 14, 3, 4, 1 }, { 12, 6, 8, 9 }, { 16, 7, 10, 11 } },
				matrix);
	}
}
