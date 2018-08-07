package xuyuji.leetcode.Q0101_SymmetricTree;

import xuyuji.leetcode.common.tree.TreeNode;

public class Solution2 {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}
		return isSymmetric(root.left, root.right);
	}

	public boolean isSymmetric(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		}
		if (left == null || right == null) {
			return false;
		}

		if (left.val != right.val) {
			return false;
		} else {
			return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
		}
	}

}
