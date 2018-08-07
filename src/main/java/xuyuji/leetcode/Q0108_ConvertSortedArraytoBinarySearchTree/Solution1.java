package xuyuji.leetcode.Q0108_ConvertSortedArraytoBinarySearchTree;

import xuyuji.leetcode.common.tree.TreeNode;

public class Solution1 {
	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		return sortedArrayToBST(nums, 0, nums.length);
	}

	private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
		if (start >= end) {
			return null;
		}
		int middle = (end + start) / 2;
		TreeNode node = new TreeNode(nums[middle]);
		node.left = sortedArrayToBST(nums, start, middle);
		node.right = sortedArrayToBST(nums, middle + 1, end);
		return node;
	}
}
