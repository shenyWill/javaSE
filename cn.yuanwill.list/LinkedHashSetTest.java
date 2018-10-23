package cn.yuanwill.List;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedHashSet<String> link = new LinkedHashSet<>();
		link.add("abc");
		link.add("abc");
		link.add("def");
		link.add("def");
		System.out.println(link);
	}

}
