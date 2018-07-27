package xuyuji.leetcode.Q0350_IntersectionOfTwoArraysII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2 {
	public int[] intersect(int[] nums1, int[] nums2) {
		if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
			return new int[] {};
		}

		if (nums1.length > nums2.length) {
			return intersect(nums1, buildMap(nums2));
		} else {
			return intersect(nums2, buildMap(nums1));
		}
	}

	private int[] intersect(int[] nums, Map<Integer, Integer> map) {
		// 如果nums非常大，内存中无法存储，那么分批读取即可
		List<Integer> list = new ArrayList<>();
		int i = 0;
		while (i < nums.length && !map.isEmpty()) {
			int n = nums[i];
			if (map.containsKey(n)) {
				list.add(n);
				int j = map.get(n);
				if (j == 1) {
					map.remove(n);
				} else {
					map.put(n, map.get(n) - 1);
				}
			}
			i++;
		}

		int[] result = new int[list.size()];
		for (int index = 0; index < list.size(); index++) {
			result[index] = list.get(index);
		}
		return result;
	}

	private Map<Integer, Integer> buildMap(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>(nums.length);
		for (int n : nums) {
			if (map.containsKey(n)) {
				map.put(n, map.get(n) + 1);
			} else {
				map.put(n, 1);
			}
		}
		return map;
	}
}
