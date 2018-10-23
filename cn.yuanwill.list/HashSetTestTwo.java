package cn.yuanwill.List;

import java.util.HashSet;

public class HashSetTestTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p = new Person();
		int i = p.hashCode();
		System.out.println(i);
	
		HashSet<String> set = new HashSet<>();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new String("def"));
		set.add(new String("def"));
		set.add("def");
		System.out.println(set);
		
		
		HashSet<Person> personSet = new HashSet<>();
		personSet.add(new Person("b", 30));
		personSet.add(new Person("a", 20));
		personSet.add(new Person("d", 40));
		personSet.add(new Person("a", 20));
		personSet.add(new Person("r", 90));
		System.out.println(personSet);
	}

}

