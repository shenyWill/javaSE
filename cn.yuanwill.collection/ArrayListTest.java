package cn.yuanwill.ArrayLists;

import java.util.ArrayList;

public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		ArrayList<Person> arrayPerson = new ArrayList<>();
		arrayPerson.add(new Person("a", 20));
		arrayPerson.add(new Person("b", 21));
		arrayPerson.add(new Person("c", 22));
		for (int i = 0; i < arrayPerson.size(); i++) {
			/*
			 * �����person�е�toString()����
			 */
			System.out.println(arrayPerson.get(i));
		}
	}

}
