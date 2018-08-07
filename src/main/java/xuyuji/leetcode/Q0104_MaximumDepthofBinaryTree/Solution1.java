package xuyuji.leetcode.Q0104_MaximumDepthofBinaryTree;

import xuyuji.leetcode.common.tree.TreeNode;

public class Solution1 {
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}
}
