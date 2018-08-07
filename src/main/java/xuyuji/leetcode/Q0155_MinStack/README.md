# 155. 最小栈

设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。

- push(x) -- 将元素 x 推入栈中。
- pop() -- 删除栈顶的元素。
- top() -- 获取栈顶元素。
- getMin() -- 检索栈中的最小元素。

**示例:**

```
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> 返回 -3.
minStack.pop();
minStack.top();      --> 返回 0.
minStack.getMin();   --> 返回 -2.
```



# 解题思路

* Solution1：针对栈的特性，出栈都是固定一头，一个元素出栈入栈是不会影响之前栈的最小值的，每一段栈的最小值是固定的，那么可以在每个栈节点记录栈当前最小值，入栈时记录当前栈的最小值(min(stack[i].val, stack[i-1].min))，查询最小值时获取最外层节点的min值即可。其他操作就是普通的栈了。




