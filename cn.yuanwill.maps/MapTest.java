package cn.yuanwill.maps;

import java.util.HashMap;
import java.util.Map;



public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		System.out.println(map);
		
		int i = map.get("a");
		System.out.println(i);
		
		int i1 = map.remove("a");
		System.out.println(i1);
		System.out.println(map);
 	}

}
