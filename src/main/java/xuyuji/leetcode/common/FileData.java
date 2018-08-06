package xuyuji.leetcode.common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileData {

	public static int[] readArray(String filePath) {
		return readArray(filePath, ",");
	}

	public static int[] readArray(String filePath, String splitStr) {
		List<Integer> list = readList(filePath, splitStr);

		if (list.isEmpty()) {
			return new int[] {};
		} else {
			int[] longArray = new int[list.size()];
			for (int i = 0; i < list.size(); i++) {
				longArray[i] = list.get(i);
			}
			return longArray;
		}
	}

	public static List<Integer> readList(String filePath) {
		return readList(filePath, ",");
	}

	public static List<Integer> readList(String filePath, String splitStr) {
		List<Integer> list = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				for (String numStr : line.split(splitStr)) {
					list.add(Integer.parseInt(numStr));
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return new ArrayList<>();
		} catch (IOException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}

		return list;
	}
}
