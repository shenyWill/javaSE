package cn.yuanwill.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListErrorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			if (it.next().equalsIgnoreCase("abc3")) {
//				list.add("haha");
				System.out.println("it equals abc3");
			}
			
		}
	}

}
