package xuyuji.leetcode.Q0101_SymmetricTree;

import java.util.ArrayList;
import java.util.List;

import xuyuji.leetcode.common.tree.TreeNode;

public class Solution1 {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}

		List<TreeNode> queue = new ArrayList<>();
		List<TreeNode> nextQueue;
		queue.add(root);

		while (!queue.isEmpty()) {
			if (isPalindrome(queue)) {
				nextQueue = new ArrayList<>();
				for (TreeNode treeNode : queue) {
					if (treeNode != null) {
						nextQueue.add(treeNode.left);
						nextQueue.add(treeNode.right);
					}
				}
				queue = nextQueue;
			} else {
				return false;
			}
		}

		return true;
	}

	private boolean isPalindrome(List<TreeNode> list) {
		if (list.size() == 1) {
			return true;
		}

		int left = 0;
		int right = list.size() - 1;
		while (left < right) {
			if (isEquels(list.get(left), list.get(right))) {
				left++;
				right--;
			} else {
				return false;
			}
		}
		return true;
	}

	private boolean isEquels(TreeNode node1, TreeNode node2) {
		if (node1 == null && node2 == null) {
			return true;
		} else if ((node1 == null && node2 != null) || (node1 != null && node2 == null)) {
			return false;
		} else {
			return node1.val == node2.val;
		}
	}
}
