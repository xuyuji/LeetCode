package xuyuji.leetcode.Q0098_ValidateBinarySearchTree;

public class Solution1 {
	public boolean isValidBST(TreeNode root) {
		if (root == null) {
			return true;
		}

		boolean leftFlag = true;
		if (root.left != null) {
			if (maxVal(root.left) >= root.val) {
				return false;
			}
			leftFlag = isValidBST(root.left);
		}

		boolean rightFlag = true;
		if (root.right != null) {
			if (root.val >= minVal(root.right)) {
				return false;
			}
			rightFlag = isValidBST(root.right);
		}

		return leftFlag && rightFlag;
	}

	private int maxVal(TreeNode node) {
		int maxVal = node.val;

		if (node.left != null) {
			int leftMaxVal = maxVal(node.left);
			if (leftMaxVal > maxVal) {
				maxVal = leftMaxVal;
			}
		}

		if (node.right != null) {
			int rightMaxVal = maxVal(node.right);
			if (rightMaxVal > maxVal) {
				maxVal = rightMaxVal;
			}
		}

		return maxVal;
	}

	private int minVal(TreeNode node) {
		int minVal = node.val;

		if (node.left != null) {
			int leftMinVal = minVal(node.left);
			if (leftMinVal < minVal) {
				minVal = leftMinVal;
			}
		}

		if (node.right != null) {
			int rightMinVal = minVal(node.right);
			if (rightMinVal < minVal) {
				minVal = rightMinVal;
			}
		}

		return minVal;
	}

	public static void main(String[] args) {
		Solution1 solution = new Solution1();

		TreeNode t1 = new TreeNode(2);
		t1.left = new TreeNode(1);
		t1.right = new TreeNode(3);

		System.out.println(solution.isValidBST(t1));

		TreeNode t2 = new TreeNode(5);
		t2.left = new TreeNode(1);
		t2.right = new TreeNode(4);
		t2.right.left = new TreeNode(3);
		t2.right.right = new TreeNode(6);

		System.out.println(solution.isValidBST(t2));

		TreeNode t3 = new TreeNode(1);
		t3.left = new TreeNode(1);

		System.out.println(solution.isValidBST(t3));

		TreeNode t4 = new TreeNode(1);
		t4.right = new TreeNode(1);

		System.out.println(solution.isValidBST(t4));
	}
}
