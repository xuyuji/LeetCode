package xuyuji.leetcode.Q0155_MinStack;

public class Solution1 implements MinStack {
	class MinStackNode {
		public int val;
		public MinStackNode next;
		public int stackMinValue;

		public MinStackNode(int x, int y) {
			val = x;
			stackMinValue = y;
		}
	}

	private MinStackNode head;

	private int len;

	public Solution1() {
		head = new MinStackNode(0, Integer.MAX_VALUE);
		len = 0;
	}

	public void push(int x) {
		int stackMinValue = head.stackMinValue;
		if (x < stackMinValue) {
			stackMinValue = x;
		}
		MinStackNode newNode = new MinStackNode(x, stackMinValue);
		newNode.next = head;
		head = newNode;
		len++;
	}

	public void pop() {
		if (len > 0) {
			head = head.next;
			len--;
		}
	}

	public int top() {
		return head.val;
	}

	public int getMin() {
		return head.stackMinValue;
	}
}
