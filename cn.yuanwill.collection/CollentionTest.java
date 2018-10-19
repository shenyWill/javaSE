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
		
		// toArray() �����ϱ������
		Object[] objs = coll.toArray();
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i]);
		}
		System.out.println("----------------------------");
		
		// remove() ɾ��������Ԫ��
		boolean b1 = coll.remove("def");
		System.out.println(b1);
		System.out.println(coll);
		System.out.println("----------------------------");
		
		// Ԫ����գ����Ǽ�����Ȼ����
		coll.clear();
		coll.add("haha");
		System.out.println(coll);
		System.out.println("----------------------------");
		
		
		// contains �ж�Ԫ���Ƿ���Ԫ�ؼ�����
		boolean b = coll.contains("haha");
		System.out.println(b);
		
		
	}

}
