package xuyuji.leetcode.Q0210_CourseScheduleII;

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
	public void testFindOrder1() {
		assertArrayEquals(new int[] { 0, 5, 3, 7, 6, 4, 2, 1 },
				solution.findOrder(8,
						new int[][] { new int[] { 6, 7 }, new int[] { 6, 5 }, new int[] { 3, 5 }, new int[] { 4, 6 },
								new int[] { 2, 6 }, new int[] { 4, 3 }, new int[] { 1, 3 }, new int[] { 2, 4 },
								new int[] { 1, 2 }, new int[] { 2, 0 } }));
	}

	@Test
	public void testFindOrder2() {
		assertArrayEquals(new int[0], solution.findOrder(8, new int[][] { new int[] { 1, 0 }, new int[] { 0, 1 } }));
	}

}
