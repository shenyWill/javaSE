package cn.yuanwill.maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapTestTwo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		Set<String> set = map.keySet();
		for (String string : set) {
			System.out.println(map.get(string));
		}
		
	}

}
