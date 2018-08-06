package xuyuji.leetcode.Q0011_ContainerWithMostWater;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import xuyuji.leetcode.common.FileData;

public class Solution1Test {

	private Solution1 solution;

	private int[] longArray;

	@Before
	public void setup() throws IOException {
		solution = new Solution1();
		initLongArray();
	}

	private void initLongArray() throws IOException {
		longArray = FileData.readArray("src\\main\\resources\\xuyuji\\leetcode\\Q0011_ContainerWithMostWater\\data.txt");
	}

	@Test
	public void testMaxArea1() {
		assertEquals(1, solution.maxArea(new int[] { 1, 1 }));
	}

	@Test(timeout = 2)
	public void testMaxArea2() {
		assertEquals(56250000, solution.maxArea(longArray));
	}

	@Test
	public void testMaxArea3() {
		assertEquals(4, solution.maxArea(new int[] { 2, 3, 2, 1 }));
	}
}
