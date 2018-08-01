package xuyuji.leetcode.Q0055_JumpGame;

public class Solution2 {
	public boolean canJump(int[] nums) {
		if (nums == null || nums.length <= 1) {
			return true;
		}

		int maxJump = 0;
		int len = nums.length - 1;
		for (int i = 0; i < len; i++) {
			if (maxJump < i) {
				return false;
			}
			maxJump = Math.max(maxJump, nums[i] + i);
			if (maxJump >= len) {
				return true;
			}
		}

		return false;
	}
}
