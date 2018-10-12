package cn.yuanwill.statics;

public class Person {
	private String name;
	private static int age;
	public static int getAge() {
		return age;
	}
	public static void setAge(int age) {
		Person.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
