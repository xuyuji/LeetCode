package xuyuji.leetcode.Q0098_ValidateBinarySearchTree;

import xuyuji.leetcode.common.tree.TreeNode;

public class Solution1 {
	public boolean isValidBST(TreeNode root) {
		if (root == null) {
			return true;
		}

		boolean leftFlag = true;
		if (root.left != null) {
			if (maxVal(root.left) >= root.val) {
				return false;
			}
			leftFlag = isValidBST(root.left);
		}

		boolean rightFlag = true;
		if (root.right != null) {
			if (root.val >= minVal(root.right)) {
				return false;
			}
			rightFlag = isValidBST(root.right);
		}

		return leftFlag && rightFlag;
	}

	private int maxVal(TreeNode node) {
		int maxVal = node.val;

		if (node.left != null) {
			int leftMaxVal = maxVal(node.left);
			if (leftMaxVal > maxVal) {
				maxVal = leftMaxVal;
			}
		}

		if (node.right != null) {
			int rightMaxVal = maxVal(node.right);
			if (rightMaxVal > maxVal) {
				maxVal = rightMaxVal;
			}
		}

		return maxVal;
	}

	private int minVal(TreeNode node) {
		int minVal = node.val;

		if (node.left != null) {
			int leftMinVal = minVal(node.left);
			if (leftMinVal < minVal) {
				minVal = leftMinVal;
			}
		}

		if (node.right != null) {
			int rightMinVal = minVal(node.right);
			if (rightMinVal < minVal) {
				minVal = rightMinVal;
			}
		}

		return minVal;
	}
}
