package cn.yuanwill.maps;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> link = new LinkedHashMap<>();
		link.put("one", 1);
		link.put("two", 2);
		link.put("three", 3);
		System.out.println(link);
		for (String string : link.keySet()) {
			System.out.println(link.get(string));
		}
		for (Map.Entry<String, Integer> entry : link.entrySet()) {
			System.out.println(entry.getKey() + "..." + entry.getValue());
		}
	}

}
