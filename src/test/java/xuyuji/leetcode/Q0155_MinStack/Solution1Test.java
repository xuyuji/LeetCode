package xuyuji.leetcode.Q0155_MinStack;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Solution1Test {

	private MinStack minStack;

	@Before
	public void setup() {
		minStack = new Solution1();
	}

	@Test
	public void testMinStack1() {
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		assertEquals(-3, minStack.getMin());
		minStack.pop();
		assertEquals(0, minStack.top());
		assertEquals(-2, minStack.getMin());
	}

	@Test
	public void testMinStack2() {
		minStack.push(2);
		minStack.push(0);
		minStack.push(3);
		minStack.push(0);
		assertEquals(0, minStack.getMin());
		minStack.pop();
		assertEquals(0, minStack.getMin());
		minStack.pop();
		assertEquals(0, minStack.getMin());
		minStack.pop();
		assertEquals(2, minStack.getMin());
	}
}
