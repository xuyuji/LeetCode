package xuyuji.leetcode.Q0015_3Sum;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution2 {
	public List<List<Integer>> threeSum(int[] nums) {
		if (nums.length < 3)
			return Collections.emptyList();
		List<List<Integer>> res = new ArrayList<>();
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		int negSize = 0;
		int posSize = 0;
		int zeroSize = 0;

		// 统计最大值、最小值、负数数量、正数数量、零数量
		for (int v : nums) {
			if (v < minValue)
				minValue = v;
			if (v > maxValue)
				maxValue = v;
			if (v > 0)
				posSize++;
			else if (v < 0)
				negSize++;
			else
				zeroSize++;
		}

		// 三零处理
		if (zeroSize >= 3)
			res.add(Arrays.asList(0, 0, 0));

		// 没有负数或正数和不可能为0，结束
		if (negSize == 0 || posSize == 0)
			return res;

		// 减除多余的范围：当一侧最大绝对值的两倍都不如另一侧的最大绝对值时，超出两倍绝对值的部分不可能找到结果集
		if (minValue * 2 + maxValue > 0)
			maxValue = -minValue * 2;
		else if (maxValue * 2 + minValue < 0)
			minValue = -maxValue * 2;

		// 创造数图，通过数值可以快速获取该数出现次数。
		// PS：如果数值范围非常大(数可能很少)，这里会非常浪费内存，可以换hash表
		int[] map = new int[maxValue - minValue + 1];
		int[] negs = new int[negSize];
		int[] poses = new int[posSize];
		negSize = 0;
		posSize = 0;
		for (int v : nums) {
			if (v >= minValue && v <= maxValue) {
				if (map[v - minValue]++ == 0) {
					if (v > 0)
						poses[posSize++] = v;
					else if (v < 0)
						negs[negSize++] = v;
				}
			}
		}
		Arrays.sort(poses, 0, posSize);
		Arrays.sort(negs, 0, negSize);
		int basej = 0;
		for (int i = negSize - 1; i >= 0; i--) {
			int nv = negs[i];
			int minp = (-nv) >>> 1; // 除2

			// 去重的同时减少运算量。例如：1+7=8，[1,7][7,1]都是结果，从4+开始处理，可避免重复，减少一半运算量。
			while (basej < posSize && poses[basej] < minp)
				basej++;
			for (int j = basej; j < posSize; j++) {
				int pv = poses[j];
				int cv = 0 - nv - pv;
				if (cv >= nv && cv <= pv) {
					// 计算出的c值去数图查询是否存在
					// 如果c值与a、b值相同，数图中出现的次数必须大于1
					if (cv == nv) {
						if (map[nv - minValue] > 1)
							res.add(Arrays.asList(nv, nv, pv));
					} else if (cv == pv) {
						if (map[pv - minValue] > 1)
							res.add(Arrays.asList(nv, pv, pv));
					} else {
						if (map[cv - minValue] > 0)
							res.add(Arrays.asList(nv, cv, pv));
					}
				} else if (cv < nv)
					break;
			}
		}
		return res;
	}

	public static void main(String[] args) throws IOException {
		Solution2 solution = new Solution2();
		List<List<Integer>> list = solution.threeSum(new int[] { -1, 0, 1, 2, -1, -4 });

		int[][] arr3 = { { 2, 3, 1 }, { 7, 5, 4, 9 }, { 5, 0 } };

		System.out.println(solution.threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));
		System.out.println(solution.threeSum(new int[] { -2, 0, 1, 1, 2 }));
		System.out.println(solution.threeSum(new int[] { -2, -1, -1, 0, 1, 1, 2 }));
	}
}
