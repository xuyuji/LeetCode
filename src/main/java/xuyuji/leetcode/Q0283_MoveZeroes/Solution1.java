package xuyuji.leetcode.Q0283_MoveZeroes;

public class Solution1 {
	public void moveZeroes(int[] nums) {
		int right = nums.length - 1;
		while (right >= 0 && nums[right] == 0) {
			right--;
		}

		for (int i = right; i >= 0 && right >= 0; i--) {
			if (nums[i] == 0) {
				for (int j = i; j < right; j++) {
					nums[j] = nums[j + 1];
				}
				nums[right--] = 0;
			}
		}
	}
}
