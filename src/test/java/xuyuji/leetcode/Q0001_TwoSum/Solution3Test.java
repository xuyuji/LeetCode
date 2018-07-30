package xuyuji.leetcode.Q0001_TwoSum;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class Solution3Test {

	private Solution2 solution;

	@Before
	public void setup() {
		solution = new Solution2();
	}

	@Test
	public void testTwoSum1() {
		int[] nums = new int[] { 2, 7, 11, 15 };
		int target = 9;
		int[] result = solution.twoSum(nums, target);
		assertArrayEquals(result, new int[] { 0, 1 });
	}

	@Test
	public void testTwoSum2() {
		int[] nums = new int[] { 3, 2, 4 };
		int target = 6;
		int[] result = solution.twoSum(nums, target);
		assertArrayEquals(result, new int[] { 1, 2 });
	}
}
