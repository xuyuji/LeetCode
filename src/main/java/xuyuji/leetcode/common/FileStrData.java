package xuyuji.leetcode.common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileStrData {

	public static String[] readArray(String filePath) {
		return readArray(filePath, ",");
	}

	public static String[] readArray(String filePath, String splitStr) {
		List<String> list = readList(filePath, splitStr);

		if (list.isEmpty()) {
			return new String[] {};
		} else {
			String[] strArray = new String[list.size()];
			for (int i = 0; i < list.size(); i++) {
				strArray[i] = list.get(i);
			}
			return strArray;
		}
	}

	public static List<String> readList(String filePath) {
		return readList(filePath, ",");
	}

	public static List<String> readList(String filePath, String splitStr) {
		List<String> list = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				for (String str : line.split(splitStr)) {
					list.add(str);
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
