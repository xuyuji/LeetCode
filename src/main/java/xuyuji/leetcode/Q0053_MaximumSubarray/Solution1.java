package xuyuji.leetcode.Q0053_MaximumSubarray;

public class Solution1 {
	public int maxSubArray(int[] nums) {
		int thisMax = 0, maxSum = nums[0];
		for (int i = 0; i < nums.length; i++) {
			thisMax += nums[i];
			if (thisMax > maxSum) {
				maxSum = thisMax;
			}
			if (thisMax < 0) {
				thisMax = 0;
			}
		}
		return maxSum;
	}
}
