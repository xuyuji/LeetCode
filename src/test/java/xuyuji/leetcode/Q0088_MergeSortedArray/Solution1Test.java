package xuyuji.leetcode.Q0088_MergeSortedArray;

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
	public void testMerge1() {
		int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = new int[] { 2, 5, 6 };
		solution.merge(nums1, 3, nums2, 3);

		assertArrayEquals(new int[] { 1, 2, 2, 3, 5, 6 }, nums1);
	}

	@Test
	public void testMerge2() {
		int[] nums1 = new int[] { 0 };
		int[] nums2 = new int[] { 1 };
		solution.merge(nums1, 0, nums2, 1);

		assertArrayEquals(new int[] { 1 }, nums1);
	}
}
