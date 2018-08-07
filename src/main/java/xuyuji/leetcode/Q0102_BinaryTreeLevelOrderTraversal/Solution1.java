package xuyuji.leetcode.Q0102_BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;

import xuyuji.leetcode.common.tree.TreeNode;

public class Solution1 {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null) {
			return result;
		}

		List<Integer> list;
		List<TreeNode> queue = new ArrayList<>();
		List<TreeNode> nextQueue;
		queue.add(root);

		while (!queue.isEmpty()) {
			list = new ArrayList<>();
			nextQueue = new ArrayList<>();
			for (TreeNode node : queue) {
				list.add(node.val);
				if (node.left != null) {
					nextQueue.add(node.left);
				}
				if (node.right != null) {
					nextQueue.add(node.right);
				}
			}

			result.add(list);
			queue = nextQueue;
		}

		return result;
	}
}
