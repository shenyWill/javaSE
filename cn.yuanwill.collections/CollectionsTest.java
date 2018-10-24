package cn.yuanwill.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("c");
		list.add("h");
		list.add("j");
		list.add("K");
		list.add("A");
		System.out.println(list);
		/*
		 * Collections.sort() ≈≈–Ú
		 */
		Collections.sort(list);
		System.out.println(list);
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(5);
		list1.add(10);
		list1.add(12);
		list1.add(19);
		
		int index = Collections.binarySearch(list1, 5);
		System.out.println(index);
	}

}
