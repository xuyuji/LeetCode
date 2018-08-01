# 21. 合并两个有序链表

将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 

**示例：**

```
输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4
```




# 解题思路

* Solution1：选取首节点较小的链表l1,另一个链表l2，遍历两个链表，依次将l2的节点插入到l1，返回l1。
* Solution2：leetcode高分答案，利用递归实现，简洁优雅高效。