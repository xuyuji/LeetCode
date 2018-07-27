package xuyuji.leetcode.Q0283_MoveZeroes;

public class Solution2 {
	public void moveZeroes(int[] nums) {
		int right = nums.length - 1;
		while (right >= 0 && nums[right] == 0) {
			right--;
		}

		int j = 0;
		for (int i = 0; i <= right; i++) {
			int n = nums[i];
			if (n != 0) {
				nums[j++] = n;
			}
		}

		for (; j <= right; j++) {
			nums[j] = 0;
		}
	}
}
