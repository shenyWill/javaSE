package cn.yuanwill.structure;

public class PersonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.getName());
		p.setName("haha");
		System.out.println(p.getName());
	}

}
