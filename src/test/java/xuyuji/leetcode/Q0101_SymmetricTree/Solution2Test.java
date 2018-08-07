package xuyuji.leetcode.Q0101_SymmetricTree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import xuyuji.leetcode.common.tree.TreeNode;

public class Solution2Test {

	private Solution2 solution;

	@Before
	public void setup() {
		solution = new Solution2();
	}

	@Test
	public void testIsSymmetric1() {
		TreeNode root = new TreeNode(1);

		TreeNode node2_1 = new TreeNode(2);
		TreeNode node2_2 = new TreeNode(2);
		root.left = node2_1;
		root.right = node2_2;

		TreeNode node3_1 = new TreeNode(3);
		TreeNode node3_2 = new TreeNode(4);
		node2_1.left = node3_1;
		node2_1.right = node3_2;

		TreeNode node3_3 = new TreeNode(4);
		TreeNode node3_4 = new TreeNode(3);
		node2_2.left = node3_3;
		node2_2.right = node3_4;

		assertTrue(solution.isSymmetric(root));
	}

	@Test
	public void testIsSymmetric2() {
		TreeNode root = new TreeNode(1);

		TreeNode node2_1 = new TreeNode(2);
		TreeNode node2_2 = new TreeNode(2);
		root.left = node2_1;
		root.right = node2_2;

		TreeNode node3_1 = new TreeNode(3);
		node2_1.right = node3_1;

		TreeNode node3_4 = new TreeNode(3);
		node2_2.right = node3_4;

		assertFalse(solution.isSymmetric(root));
	}
}
