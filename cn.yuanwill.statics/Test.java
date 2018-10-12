package cn.yuanwill.statics;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setName("yuan");
		p2.setName("will");
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		
		Person.setAge(222);
		System.out.println(Person.getAge());
		p1.setAge(18);
		System.out.println(p1.getAge());
		System.out.println(p2.getAge());
		System.out.println(Person.getAge());
	}

}
