# 141. 环形链表

给定一个链表，判断链表中是否有环。

**进阶：**
你能否不使用额外空间解决此题？



# 解题思路

* Solution1：用HashSet缓存已经访问过的节点，每次遍历校验节点是否已经被访问。
* Solution2：快慢双指针，慢指针每次走一个节点，快指针每次走两个节点，如果有环快指针会追上慢指针。

[官方解答](https://leetcode-cn.com/articles/linked-list-cycle/)

