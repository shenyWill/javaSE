package cn.yuanwill.List;

public class Person {
	private String name;
	private int age;

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		if (this.name != null) {
			return this.name.hashCode() + this.age;
		} else {
			return 1;
		}

	}

	@Override
	public boolean equals(Object arg0) {

		return (this.name.equals(((Person) arg0).getName()) && this.age == ((Person) arg0)
				.getAge());
	}

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
