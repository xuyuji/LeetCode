# 两个排序数组的中位数

给定两个大小为 m 和 n 的有序数组 **nums1 **和 **nums2 **。

请找出这两个有序数组的中位数。要求算法的时间复杂度为 O(log (m+n)) 。

**示例 1:**

```
nums1 = [1, 3]
nums2 = [2]

中位数是 2.0

```

**示例 2:**

```
nums1 = [1, 2]
nums2 = [3, 4]

中位数是 (2 + 3)/2 = 2.5
```


# 解题思路

* Solution1是第一次自己思考实现的，思路很简单，既然两个数组都是有序的，那么我从头按顺序走，走到总长度一半的时候即是中位数，这里涉及到奇偶处理，这个通过总长度可以判断出来。

  具体做法是取两个变量，x记录当前数值，y记录x前一次的数值，两个数组从头开始与x对比，差值小的替换x，并且数组角标后移一位，直到运行到总长度一半为止。

  需要注意的是要考虑数组已经走完，再后移会越界。

* //TODO 增加分治实现

