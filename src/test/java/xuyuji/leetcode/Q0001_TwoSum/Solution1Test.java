package xuyuji.leetcode.Q0001_TwoSum;

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
	public void testTwoSum() {
		int[] nums = new int[] { 2, 7, 11, 15 };
		int target = 9;
		int[] result = solution.twoSum(nums, target);
		assertArrayEquals(result, new int[] { 0, 1 });
	}
}
