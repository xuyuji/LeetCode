package xuyuji.leetcode.Q0011_ContainerWithMostWater;

import java.io.IOException;

public class Solution1 {
	public int maxArea(int[] height) {
		int maxArea = 0;
		int left = 0;
		int right = height.length - 1;
		while (left < right) {
			maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxArea;
	}

	public static void main(String[] args) throws IOException {
		System.out.println(new Solution1().maxArea(new int[] { 2, 3, 2, 1 }));

	}
}
