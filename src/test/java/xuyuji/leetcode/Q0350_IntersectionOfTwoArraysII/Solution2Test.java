package xuyuji.leetcode.Q0350_IntersectionOfTwoArraysII;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class Solution2Test {

	private Solution2 solution;

	@Before
	public void setup() {
		solution = new Solution2();
	}

	@Test
	public void testIntersect1() {
		assertArrayEquals(new int[] {}, solution.intersect(new int[] {}, new int[] {}));
	}

	@Test
	public void testIntersect2() {
		assertArrayEquals(new int[] {}, solution.intersect(new int[] { 1, 2, 3 }, new int[] {}));
	}

	@Test
	public void testIntersect3() {
		assertArrayEquals(new int[] {}, solution.intersect(new int[] {}, new int[] { 1, 2, 3 }));
	}

	@Test
	public void testIntersect4() {
		assertArrayEquals(new int[] { 2, 2 }, solution.intersect(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 }));
	}

	@Test
	public void testIntersect5() {
		int[] result = solution.intersect(
				new int[] { 54, 93, 21, 73, 84, 60, 18, 62, 59, 89, 83, 89, 25, 39, 41, 55, 78, 27, 65, 82, 94, 61, 12,
						38, 76, 5, 35, 6, 51, 48, 61, 0, 47, 60, 84, 9, 13, 28, 38, 21, 55, 37, 4, 67, 64, 86, 45, 33,
						41 },
				new int[] { 17, 17, 87, 98, 18, 53, 2, 69, 74, 73, 20, 85, 59, 89, 84, 91, 84, 34, 44, 48, 20, 42, 68,
						84, 8, 54, 66, 62, 69, 52, 67, 27, 87, 49, 92, 14, 92, 53, 22, 90, 60, 14, 8, 71, 0, 61, 94, 1,
						22, 84, 10, 55, 55, 60, 98, 76, 27, 35, 84, 28, 4, 2, 9, 44, 86, 12, 17, 89, 35, 68, 17, 41, 21,
						65, 59, 86, 42, 53, 0, 33, 80, 20 });

		Arrays.sort(result);

		assertArrayEquals(new int[] { 0, 4, 9, 12, 18, 21, 27, 28, 33, 35, 41, 48, 54, 55, 55, 59, 60, 60, 61, 62, 65,
				67, 73, 76, 84, 84, 86, 89, 89, 94 }, result);
	}
}
