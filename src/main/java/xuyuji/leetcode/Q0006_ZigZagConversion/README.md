# Z字形变换

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
将字符串 "PAYPALISHIRING" 以Z字形排列成给定的行数：

P   A   H   N
A P L S I I G
Y   I   R
之后从左往右，逐行读取字符："PAHNAPLSIIGYIR"

实现一个将字符串进行指定行数变换的函数:

string convert(string s, int numRows);
示例 1:

输入: s = "PAYPALISHIRING", numRows = 3
输出: "PAHNAPLSIIGYIR"
示例 2:

输入: s = "PAYPALISHIRING", numRows = 4
输出: "PINALSIGYAHRPI"
解释:

P     I    N
A   L S  I G
Y A   H R
P     I

```


# 解题思路

* Solution1：观察图形结构，每一次转折都是同样的V结构，每个位置的字符都可以转置，下一个结构增加固定长度即可。

  每个V结构长度m=2×numRows-2

  假设k=[0,∞),i=[2,numRows-1]

  第一行字符line1=s.charAt(0+k×m)

  第i行字符linex1=s.charAt(i-1+k×m),linex2=s.charAt(m-(i-1)+k×m)

  第numRows行字符linen=s.charAt(numRows-1+k×m)

  一行行遍历拼接新字符串即可


