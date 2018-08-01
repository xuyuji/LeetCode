package xuyuji.leetcode.Q0053_MaximumSubarray;

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
	public void testMaxSubArray1() {
		assertEquals(6, solution.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
	}

}
