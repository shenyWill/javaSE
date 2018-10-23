package cn.yuanwill.List;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
//		for (String string : list) {
//			System.out.println(string);
//		}
		System.out.println(list);
		
		List<Double> list1 = new ArrayList<>();
		list1.add((double) 1);
		list1.add(1.1);
		list1.add(1.2);
		list1.add(1.3);
		list1.add(1.4);
		
		Double d = list1.remove(0);
		System.out.println(d);
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		int i = list2.set(0, 9);
		System.out.println(i);
		System.out.println(list2);
	}

}
