package cn.yuanwill.collections;

import java.util.HashMap;
import java.util.Map;

public class MapIncludeMapTest {

	public static void main(String[] args) {
		Map<String, Map<Integer, String>> map = new HashMap<>();
		Map<Integer, String> javase = new HashMap<>();
		javase.put(1, "张三");
		javase.put(2, "李四");
		
		Map<Integer, String> javaee = new HashMap<>();
		javase.put(3, "王五");
		javase.put(4, "黑六");
		
		map.put("javase", javase);
		map.put("javaee", javaee);
		
		for (String string : map.keySet()) {
			for (Integer integer : map.get(string).keySet()) {
				System.out.println(integer + "..." + map.get(string).get(integer));
			}
		}
	}

}
