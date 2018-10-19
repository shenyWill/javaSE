package cn.yuanwill.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class iteratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc");
		coll.add("def");
		coll.add("ghi");
		coll.add("jkl");
		
		Iterator<String> it = coll.iterator();
		boolean b = it.hasNext();
		System.out.println(b);
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
