package cn.yuanwill.ArrayLists;

import java.util.ArrayList;
import java.util.Collection;

public class CollentionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc");
		coll.add("def");
		coll.add("ghi");
		System.out.println(coll);
		System.out.println("----------------------------");
		
		// toArray() 将集合变成数组
		Object[] objs = coll.toArray();
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i]);
		}
		System.out.println("----------------------------");
		
		// remove() 删除集合中元素
		boolean b1 = coll.remove("def");
		System.out.println(b1);
		System.out.println(coll);
		System.out.println("----------------------------");
		
		// 元素清空，但是集合依然存在
		coll.clear();
		coll.add("haha");
		System.out.println(coll);
		System.out.println("----------------------------");
		
		
		// contains 判断元素是否在元素集合中
		boolean b = coll.contains("haha");
		System.out.println(b);
		
		
	}

}
