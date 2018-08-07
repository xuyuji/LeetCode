package xuyuji.leetcode.Q0108_ConvertSortedArraytoBinarySearchTree;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import xuyuji.leetcode.common.tree.TreeNode;

public class Solution1Test {

	private Solution1 solution;

	private xuyuji.leetcode.Q0098_ValidateBinarySearchTree.Solution2 validate;

	@Before
	public void setup() {
		solution = new Solution1();
		validate = new xuyuji.leetcode.Q0098_ValidateBinarySearchTree.Solution2();
	}

	@Test
	public void testSortedArrayToBST1() {
		TreeNode result = solution.sortedArrayToBST(new int[] { -10, -3, 0, 5, 9 });
		assertTrue(validate.isValidBST(result));
	}
}
