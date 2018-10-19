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
	 * ���͵�ͨ��
	 */
	public static void iterator(Collection<?> c ) {
			Iterator<?> it = c.iterator();
			while(it.hasNext()) {
				/*
				 * it.next()ǧ��Ҫǿת����Ϊ��object����
				 */
				System.out.println(it.next());
			}
	}

}
