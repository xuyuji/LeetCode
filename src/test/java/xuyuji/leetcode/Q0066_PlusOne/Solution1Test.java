package xuyuji.leetcode.Q0066_PlusOne;

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
	public void testPlusOne1() {
		assertArrayEquals(new int[] {}, solution.plusOne(new int[] {}));
	}

	@Test
	public void testPlusOne2() {
		assertArrayEquals(new int[] { 1, 2, 4 }, solution.plusOne(new int[] { 1, 2, 3 }));
	}

	@Test
	public void testPlusOne3() {
		assertArrayEquals(new int[] { 4, 3, 2, 2 }, solution.plusOne(new int[] { 4, 3, 2, 1 }));
	}

	@Test
	public void testPlusOne4() {
		assertArrayEquals(new int[] { 4, 4, 0, 0 }, solution.plusOne(new int[] { 4, 3, 9, 9 }));
	}

	@Test
	public void testPlusOne5() {
		assertArrayEquals(new int[] { 1, 0, 0, 0, 0 }, solution.plusOne(new int[] { 9, 9, 9, 9 }));
	}
}
