package xuyuji.leetcode.Q0150_EvaluateReversePolishNotation;

import java.util.Stack;

public class Solution1 {
	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<>();
		int x, y;
		for (String token : tokens) {
			switch (token) {
			case "+":
				y = stack.pop();
				x = stack.pop();
				stack.push(x + y);
				break;
			case "-":
				y = stack.pop();
				x = stack.pop();
				stack.push(x - y);
				break;
			case "*":
				y = stack.pop();
				x = stack.pop();
				stack.push(x * y);
				break;
			case "/":
				y = stack.pop();
				x = stack.pop();
				stack.push(x / y);
				break;

			default:
				stack.push(Integer.parseInt(token));
				break;
			}
		}

		return stack.pop();
	}

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		System.out.println(s.evalRPN(new String[] { "2", "1", "+", "3", "*" }));
		System.out.println(s.evalRPN(new String[] { "4", "13", "5", "/", "+" }));
		System.out.println(
				s.evalRPN(new String[] { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" }));
	}
}
