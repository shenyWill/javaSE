package cn.yuanwill.List;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("cde");
		set.add("abc");
		set.add("fgh");
		set.add("ijk");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		for (String string : set) {
			System.out.println(string);
		}
	}

}
