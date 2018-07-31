package xuyuji.leetcode.Q0015_3Sum;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (nums.length < 3) {
			return res;
		}
		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int l = i + 1;
			int r = nums.length - 1;
			while (l < r) {
				int sum = nums[i] + nums[l] + nums[r];
				if (sum == 0) {
					res.add(Arrays.asList(nums[i], nums[l], nums[r]));
					while (l < r && nums[l] == nums[l + 1])
						l++;
					while (l < r && nums[r] == nums[r - 1])
						r--;
					l++;
					r--;
				} else if (sum < 0) {
					l++;
				} else {
					r--;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) throws IOException {
		Solution1 solution = new Solution1();
		System.out.println(solution.threeSum(new int[] { -1, 0, 0, 0, -1, 2, 1, -4 }));
		System.out.println(solution.threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));
		System.out.println(solution.threeSum(new int[] { -2, 0, 1, 1, 2 }));
		System.out.println(solution.threeSum(new int[] { -2, -1, -1, 0, 1, 1, 2 }));
		System.out.println(solution.threeSum(new int[] { 0, 1, 1, 2 }));
		System.out.println(solution.threeSum(new int[] { -2, -1, -1, 0 }));
		System.out.println(solution.threeSum(new int[] { 2, -5, 4, 0, 1, -4, -1, 2, -3, -2, -1, -5 }));
	}
}
