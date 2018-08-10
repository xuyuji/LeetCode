package xuyuji.leetcode.Q0049_GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1 {
	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs == null || strs.length == 0) {
			return new ArrayList<>();
		}

		Map<String, List<String>> map = new HashMap<>();
		for (String str : strs) {
			char[] array = str.toCharArray();
			Arrays.sort(array);
			String sortStr = new String(array);
			if (map.containsKey(sortStr)) {
				map.get(sortStr).add(str);
			} else {
				List<String> list = new ArrayList<>();
				list.add(str);
				map.put(sortStr, list);
			}
		}

		return new ArrayList<List<String>>(map.values());
	}
}
