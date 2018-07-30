package xuyuji.leetcode.Q0001_TwoSum;

public class Solution1 {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		if (nums == null || nums.length < 2) {
			return result;
		}
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
	}
}
