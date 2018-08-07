package xuyuji.leetcode.Q0150_EvaluateReversePolishNotation;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Solution1Test {

	private Solution1 solution;

	@Before
	public void setup() {
		solution = new Solution1();
	}

	@Test
	public void testEvalRPN1() {
		assertEquals(9, solution.evalRPN(new String[] { "2", "1", "+", "3", "*" }));
	}

	@Test
	public void testEvalRPN2() {
		assertEquals(6, solution.evalRPN(new String[] { "4", "13", "5", "/", "+" }));
	}

	@Test
	public void testEvalRPN3() {
		assertEquals(22,
				solution.evalRPN(new String[] { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" }));
	}

}
