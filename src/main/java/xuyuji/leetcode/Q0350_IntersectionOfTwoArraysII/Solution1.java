package xuyuji.leetcode.Q0350_IntersectionOfTwoArraysII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
	public int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);

		int i = 0;
		int j = 0;
		List<Integer> list = new ArrayList<>();
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] < nums2[j]) {
				i++;
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else {
				list.add(nums1[i]);
				i++;
				j++;
			}
		}

		if (list.isEmpty()) {
			return new int[] {};
		} else {
			int[] result = new int[list.size()];
			for (int index = 0; index < list.size(); index++) {
				result[index] = list.get(index);
			}
			return result;
		}
	}
}
