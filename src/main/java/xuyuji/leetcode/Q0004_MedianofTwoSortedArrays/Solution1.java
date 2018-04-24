package xuyuji.leetcode.Q0004_MedianofTwoSortedArrays;

public class Solution1 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if (nums1.length == 0 && nums2.length == 0) {
			return 0.0;
		} else if (nums1.length == 0 && nums2.length != 0) {
			return findMedianSortedArrays(nums2);
		} else if (nums1.length != 0 && nums2.length == 0) {
			return findMedianSortedArrays(nums1);
		} else {

			int x = 0, y = 0;
			int lengthTotle = nums1.length + nums2.length;
			int t = lengthTotle / 2;
			boolean isOddNumber = lengthTotle % 2 == 1;

			int i = 0, j = 0;
			if (nums1[0] < nums2[0]) {
				x = nums1[0];
				i++;
			} else {
				x = nums2[0];
				j++;
			}

			do {
				if (i == nums1.length) {
					y = x;
					x = nums2[j++];
					continue;
				}

				if (j == nums2.length) {
					y = x;
					x = nums1[i++];
					continue;
				}

				if ((nums1[i] - x) < (nums2[j] - x)) {
					y = x;
					x = nums1[i++];
				} else {
					y = x;
					x = nums2[j++];
				}
			} while (i + j <= t);

			if (isOddNumber) {
				return x;
			} else {
				return ((double) x + y) / 2;
			}
		}
	}

	private double findMedianSortedArrays(int[] nums) {
		int t = nums.length / 2;
		boolean isOddNumber = nums.length % 2 == 1;

		if (isOddNumber) {
			return (double) nums[t];
		} else {
			return ((double) nums[t - 1] + nums[t]) / 2;
		}
	}
}
