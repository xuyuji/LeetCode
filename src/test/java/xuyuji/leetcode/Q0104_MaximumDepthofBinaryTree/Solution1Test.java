package xuyuji.leetcode.Q0104_MaximumDepthofBinaryTree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import xuyuji.leetcode.common.tree.TreeNode;

public class Solution1Test {

	private Solution1 solution;

	@Before
	public void setup() {
		solution = new Solution1();
	}

	@Test
	public void testMaxDepth1() {
		TreeNode root = new TreeNode(3);
		TreeNode node9 = new TreeNode(9);
		TreeNode node20 = new TreeNode(20);
		TreeNode node15 = new TreeNode(15);
		TreeNode node7 = new TreeNode(7);

		root.left = node9;
		root.right = node20;
		node20.left = node15;
		node20.right = node7;

		assertEquals(3, solution.maxDepth(root));
	}
}
