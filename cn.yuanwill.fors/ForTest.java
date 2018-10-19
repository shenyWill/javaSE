package cn.yuanwill.fors;

import java.util.ArrayList;

import cn.yuanwill.ArrayLists.Person;

public class ForTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr = {1,5,6,14,35,28};
		for (int i : arr) {
			System.out.println(i+1);
		}
		
		Person[] personArr = {new Person(), new Person("yuan", 23), new Person("will", 24)};
		for (Person person : personArr) {
			System.out.println(person.getName() + "...." + person.getAge());
		}
		
		ArrayList<Person> personArrayList = new ArrayList<>();
		personArrayList.add(new Person("haha", 01));
		personArrayList.add(new Person("lala", 29));
		for (Person person : personArrayList) {
			System.out.println(person.getName() + "...." + person.getAge());
		}
	}

}
