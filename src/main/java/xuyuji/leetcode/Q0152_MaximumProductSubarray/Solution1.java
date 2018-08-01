package xuyuji.leetcode.Q0152_MaximumProductSubarray;

public class Solution1 {
	public int maxProduct(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int[] max = new int[nums.length];
		int[] min = new int[nums.length];

		max[0] = nums[0];
		min[0] = nums[0];
		int maxProduct = nums[0];
		for (int i = 1; i < nums.length; i++) {
			int n = nums[i];
			max[i] = Math.max(n, Math.max(max[i - 1] * n, min[i - 1] * n));
			min[i] = Math.min(n, Math.min(max[i - 1] * n, min[i - 1] * n));
			if (max[i] > maxProduct) {
				maxProduct = max[i];
			}
		}
		return maxProduct;
	}
}
