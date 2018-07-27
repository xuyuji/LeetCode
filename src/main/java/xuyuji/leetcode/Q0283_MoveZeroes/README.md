# 283. 移动零

给定一个数组 `nums`，编写一个函数将所有 `0` 移动到数组的末尾，同时保持非零元素的相对顺序。

**示例:**

```
输入: [0,1,0,3,12]
输出: [1,3,12,0,0]
```

**说明**:

1. 必须在原数组上操作，不能拷贝额外的数组。
2. 尽量减少操作次数。



# 解题思路

* Solution1：从后向前遍历，碰到零就把这里到尾部的一段前移。
* Solution2：从头开始遍历，非零值按序存储，记录非零值坐标，多出的都是0。