# 16. 最接近的三数之和

给定一个包括 n 个整数的数组 `nums` 和 一个目标值 `target`。找出 `nums` 中的三个整数，使得它们的和与 `target` 最接近。返回这三个数的和。假定每组输入只存在唯一答案。

 

**示例：**

> 输入：nums = [-1,2,1,-4], target = 1
> 输出：2
> 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。

**提示：**

- `3 <= nums.length <= 10^3`
- `-10^3 <= nums[i] <= 10^3`
- `-10^4 <= target <= 10^4`




# 解题思路

* Solution1：先对数组升序排序，然后从头开始固定一个数，游标为i，定义双游标j=i+1、k=length-1，三数求和，如果大于等于target，k--；如果小于target，i++；三数和不断逼近target，期间记录与target差值绝对值最小的三数和。