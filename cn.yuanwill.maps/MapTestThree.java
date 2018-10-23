package cn.yuanwill.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTestThree {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		
		
		Set<Map.Entry<String, Integer>> set = map.entrySet();
//		Iterator<Map.Entry<String, Integer>> it = set.iterator();
//		while(it.hasNext()) {
//			Map.Entry<String, Integer> entry = it.next();
//			String key = entry.getKey();
//			int value = entry.getValue();
//			System.out.println(key + "..." + value);
//		}
		for (Map.Entry<String, Integer> entry : set) {
			System.out.println(entry.getKey() + "..." + entry.getValue());
		}
	}

}
