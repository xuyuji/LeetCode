package xuyuji.leetcode.Q0055_JumpGame;

public class Solution1 {
	public boolean canJump(int[] nums) {
		if (nums == null || nums.length == 0) {
			return true;
		}

		int[] map = new int[nums.length];
		for (int i = 0; i < nums.length - 1; i++) {
			map[i + 1] = Math.max(map[i] - 1, nums[i]);
			if (map[i + 1] <= 0) {
				return false;
			}
		}

		return true;
	}
}
