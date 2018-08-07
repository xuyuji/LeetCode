package xuyuji.leetcode.Q0098_ValidateBinarySearchTree;

import xuyuji.leetcode.common.tree.TreeNode;

public class Solution2 {
	private TreeNode pre;

	public boolean isValidBST(TreeNode root) {
		if (root == null) {
			return true;
		}
		boolean f = isValidBST(root.left);
		boolean f2 = pre == null || pre.val < root.val;
		pre = root;
		return f && f2 && isValidBST(root.right);
	}
}
