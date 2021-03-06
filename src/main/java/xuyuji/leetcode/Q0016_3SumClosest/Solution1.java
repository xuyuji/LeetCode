package xuyuji.leetcode.Q0016_3SumClosest;

import java.util.Arrays;

public class Solution1 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int result = nums[0] + nums[1] + nums[2];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    return sum;
                } else if (sum >= target) {
                    k--;
                } else {
                    j++;
                }

                if (Math.abs(result - target) > Math.abs(sum - target)) {
                    result = sum;
                }
            }
        }

        return result;
    }
}
