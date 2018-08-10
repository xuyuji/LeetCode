package xuyuji.leetcode.Q0234_PalindromeLinkedList;

import java.util.Stack;

import xuyuji.leetcode.common.FileNumsData;
import xuyuji.leetcode.common.linkedList.ListNode;

public class Solution1 {

	private Stack<Integer> stack;
	private int leftMax;
	private int rightMin;

	public boolean isPalindrome(ListNode head) {
		if (head == null) {
			return true;
		}

		stack = new Stack<>();
		leftMax = 0;
		rightMin = 0;

		return isPalindrome(head, 0);
	}

	private boolean isPalindrome(ListNode head, int i) {
		if (head == null) {
			leftMax = i / 2;
			rightMin = leftMax + i % 2;
			return true;
		}
		boolean flag = isPalindrome(head.next, i + 1);
		if (flag) {
			if (i >= rightMin) {
				stack.push(head.val);
			}
			if (i < leftMax && stack.pop() != head.val) {
				return false;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Solution1 s = new Solution1();

		System.out.println(s.isPalindrome(ListNode.valueOf(new int[] { 1 })));
		System.out.println(s.isPalindrome(ListNode.valueOf(new int[] { 1, 2 })));
		System.out.println(s.isPalindrome(ListNode.valueOf(new int[] { 1, 2, 2, 1 })));
		System.out.println(s.isPalindrome(ListNode.valueOf(new int[] { 1, 2, 1 })));
		System.out.println(s.isPalindrome(ListNode.valueOf(new int[] { -129, -129 })));
		System.out.println(s.isPalindrome(ListNode.valueOf(
				FileNumsData.readArray("src\\main\\resources\\xuyuji\\leetcode\\Q0234_PalindromeLinkedList\\data.txt"))));

	}
}
