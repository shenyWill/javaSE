package cn.yuanwill.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class GenericTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		
		array.add("123");
		array.add("456");
		
		set.add(789);
		set.add(901);
		
		iterator(array);
		iterator(set);
	}
	
	/*
	 * 泛型的通配
	 */
	public static void iterator(Collection<?> c ) {
			Iterator<?> it = c.iterator();
			while(it.hasNext()) {
				/*
				 * it.next()千万不要强转，因为是object类型
				 */
				System.out.println(it.next());
			}
	}

}
