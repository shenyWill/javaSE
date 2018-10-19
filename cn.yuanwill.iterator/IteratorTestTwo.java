package cn.yuanwill.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTestTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 如果集合不给定强制数据类型也可以，但是不建议这样做，因为这样会把所有集合中的元素提升为object
		 */
		Collection coll = new ArrayList();
		coll.add("abc");
		coll.add("123");
		
		Iterator it = coll.iterator();
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s);
		}
	}

}
