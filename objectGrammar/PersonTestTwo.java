package cn.yuanwill.variable;

public class PersonTestTwo {
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(18);
		p.setName("yuan");
		p.speak();
//		System.out.println(p.getAge());
		Person p1 = new Person();
		Person p2 = new Person();
		p1.setAge(15);
		p2.setAge(15);
		System.out.println(p1.compareAge(p2));
	}
}
