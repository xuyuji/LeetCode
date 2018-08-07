package xuyuji.leetcode.Q0098_ValidateBinarySearchTree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
	public void testIsValidBST1() {
		TreeNode treeNode = new TreeNode(2);
		treeNode.left = new TreeNode(1);
		treeNode.right = new TreeNode(3);

		assertTrue(solution.isValidBST(treeNode));
	}

	@Test
	public void testIsValidBST2() {
		TreeNode treeNode = new TreeNode(5);
		treeNode.left = new TreeNode(1);
		treeNode.right = new TreeNode(4);
		treeNode.right.left = new TreeNode(3);
		treeNode.right.right = new TreeNode(6);

		assertFalse(solution.isValidBST(treeNode));
	}

	@Test
	public void testIsValidBST3() {
		TreeNode treeNode = new TreeNode(1);
		treeNode.left = new TreeNode(1);

		assertFalse(solution.isValidBST(treeNode));
	}

	@Test
	public void testIsValidBST4() {
		TreeNode treeNode = new TreeNode(1);
		treeNode.right = new TreeNode(1);

		assertFalse(solution.isValidBST(treeNode));
	}
}
