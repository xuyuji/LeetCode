package xuyuji.leetcode.Q0001_TwoSum;

import java.util.Arrays;

public class Solution2 {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		if (nums == null || nums.length < 2) {
			return result;
		}

		int[] temp = nums.clone();
		Arrays.sort(temp);

		int left = 0;
		int right = temp.length - 1;
		while (left < right) {
			int sum = temp[left] + temp[right];
			if (sum > target) {
				right--;
			} else if (sum < target) {
				left++;
			} else {
				break;
			}
		}

		int t = 0;
		for (int i = 0; i < nums.length && t < 2; i++) {
			int n = nums[i];
			if (temp[left] == n || temp[right] == n) {
				result[t++] = i;
			}
		}

		return result;
	}
}
