package xuyuji.leetcode.Q0155_MinStack;

public interface MinStack {
	/**
	 * 功能描述： 将元素 x 推入栈中。
	 * 
	 * @param x
	 */
	public void push(int x);

	/**
	 * 功能描述： 删除栈顶的元素。
	 */
	public void pop();

	/**
	 * 功能描述：获取栈顶元素。
	 * 
	 * @return
	 */
	public int top();

	/**
	 * 功能描述： 检索栈中的最小元素。
	 * 
	 * @return
	 */
	public int getMin();
}
