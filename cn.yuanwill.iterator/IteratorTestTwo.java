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
		 * ������ϲ�����ǿ����������Ҳ���ԣ����ǲ���������������Ϊ����������м����е�Ԫ������Ϊobject
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
