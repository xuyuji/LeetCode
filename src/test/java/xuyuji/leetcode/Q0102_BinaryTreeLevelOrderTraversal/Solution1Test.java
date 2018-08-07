package xuyuji.leetcode.Q0102_BinaryTreeLevelOrderTraversal;

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
	public void testLevelOrder1() {
		TreeNode root = new TreeNode(3);

		TreeNode node2_1 = new TreeNode(9);
		TreeNode node2_2 = new TreeNode(20);
		root.left = node2_1;
		root.right = node2_2;

		TreeNode node3_3 = new TreeNode(15);
		TreeNode node3_4 = new TreeNode(7);
		node2_2.left = node3_3;
		node2_2.right = node3_4;

		assertEquals("[[3], [9, 20], [15, 7]]", solution.levelOrder(root).toString());
	}

	@Test
	public void testLevelOrder2() {
		assertEquals("[]", solution.levelOrder(null).toString());
	}
}
