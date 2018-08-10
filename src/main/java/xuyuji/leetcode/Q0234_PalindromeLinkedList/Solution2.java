package xuyuji.leetcode.Q0234_PalindromeLinkedList;

import java.util.ArrayList;
import java.util.List;

import xuyuji.leetcode.common.FileNumsData;
import xuyuji.leetcode.common.linkedList.ListNode;

public class Solution2 {

	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}

		List<Integer> list = new ArrayList<>();
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}

		int left = 0;
		int right = list.size() - 1;
		while (left < right) {
			if (list.get(left).equals(list.get(right))) {
				left++;
				right--;
			} else {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();

		System.out.println(s.isPalindrome(ListNode.valueOf(new int[] { 1 })));
		System.out.println(s.isPalindrome(ListNode.valueOf(new int[] { 1, 2 })));
		System.out.println(s.isPalindrome(ListNode.valueOf(new int[] { 1, 2, 2, 1 })));
		System.out.println(s.isPalindrome(ListNode.valueOf(new int[] { 1, 2, 1 })));
		System.out.println(s.isPalindrome(ListNode.valueOf(
				FileNumsData.readArray("src\\main\\resources\\xuyuji\\leetcode\\Q0234_PalindromeLinkedList\\data.txt"))));
		System.out.println(s.isPalindrome(ListNode.valueOf(new int[] { -129, -129 })));
	}
}
