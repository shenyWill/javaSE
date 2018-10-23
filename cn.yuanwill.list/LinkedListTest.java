package cn.yuanwill.List;

import java.util.LinkedList;

public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.addLast("lala");
		list.add("abc");
		list.add("def");
		list.addFirst("haha");
		
		String first = list.getFirst();
		String last = list.getLast();
		
		System.out.println(first);
		System.out.println(last);
		System.out.println(list);
	}

}
