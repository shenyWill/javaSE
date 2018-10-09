package cn.yuanwill.variable;

import java.util.ArrayList;
import java.util.Random;

public class CallName {
	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		addStudent(array);
		printStudent(array);
		randomStudent(array);
	}
	
	public static void addStudent(ArrayList<Student> array){
		Student s1 = new Student();
		s1.setName("yuan");
		s1.setAge(20);
		
		Student s2 = new Student();
		s2.setName("shen");
		s2.setAge(21);
		
		Student s3 = new Student();
		s3.setName("will");
		s3.setAge(22);
		
		Student s4 = new Student();
		s4.setName("haha");
		s4.setAge(23);
		
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
	}
	
	public static void printStudent(ArrayList<Student> array){
		for (int i = 0; i < array.size(); i++) {
			System.out.println("学生的名称：" + array.get(i).getName() + "..." + array.get(i).getAge());
		}
	}
	
	public static void randomStudent(ArrayList<Student> array) {
		Random ra = new Random();
		int index = ra.nextInt(array.size());
		System.out.println("学生的名称：" + array.get(index).getName() + "..." + array.get(index).getAge());
	}

}
