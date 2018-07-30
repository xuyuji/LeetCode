package xuyuji.leetcode.Q0001_TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		if (nums == null || nums.length < 2) {
			return result;
		}

		Map<Integer, Integer> map = new HashMap<>(nums.length);

		for (int i = 0; i < nums.length; i++) {
			int j = target - nums[i];
			if (map.containsKey(j)) {
				result[0] = i;
				result[1] = map.get(j);
				break;
			}

			map.put(nums[i], i);
		}
		return result;
	}
}
