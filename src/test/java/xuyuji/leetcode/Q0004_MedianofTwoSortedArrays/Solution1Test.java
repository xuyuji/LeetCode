package xuyuji.leetcode.Q0004_MedianofTwoSortedArrays;

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
	public void testFindMedianSortedArrays1() {
		int[] nums1 = new int[] { 1, 3 };
		int[] nums2 = new int[] { 2 };

		assertEquals(2.0, solution.findMedianSortedArrays(nums1, nums2), 0.0);
	}

	@Test
	public void testFindMedianSortedArrays2() {
		int[] nums1 = new int[] { 1, 2 };
		int[] nums2 = new int[] { 3, 4 };

		assertEquals(2.5, solution.findMedianSortedArrays(nums1, nums2), 0.0);
	}

	@Test
	public void testFindMedianSortedArrays3() {
		int[] nums1 = new int[] { 1, 2 };
		int[] nums2 = new int[] { 1, 1 };

		assertEquals(1.0, solution.findMedianSortedArrays(nums1, nums2), 0.0);
	}

	@Test
	public void testFindMedianSortedArrays4() {
		int[] nums1 = new int[] { 1, 1 };
		int[] nums2 = new int[] { 1, 2 };

		assertEquals(1.0, solution.findMedianSortedArrays(nums1, nums2), 0.0);
	}

	@Test
	public void testFindMedianSortedArrays5() {
		int[] nums1 = new int[] {};
		int[] nums2 = new int[] { 1 };

		assertEquals(1.0, solution.findMedianSortedArrays(nums1, nums2), 0.0);
	}

	@Test
	public void testFindMedianSortedArrays6() {
		int[] nums1 = new int[] { 1 };
		int[] nums2 = new int[] {};

		assertEquals(1.0, solution.findMedianSortedArrays(nums1, nums2), 0.0);
	}

	@Test
	public void testFindMedianSortedArrays7() {
		int[] nums1 = new int[] { 1 };
		int[] nums2 = new int[] { 2, 3, 4 };

		assertEquals(2.5, solution.findMedianSortedArrays(nums1, nums2), 0.0);
	}

	@Test
	public void testFindMedianSortedArrays8() {
		int[] nums1 = new int[] { 2, 3, 4 };
		int[] nums2 = new int[] { 1 };

		assertEquals(2.5, solution.findMedianSortedArrays(nums1, nums2), 0.0);
	}
}
