package cn.yuanwill.variable;

public class PersonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 1;
		function(a);
		System.out.println(a);
		
		Person p = new Person();
		p.setName("yuan");
		System.out.println(p.getName());
		function(p);
		System.out.println(p.getName());
	}
	
	public static void function(int a) {
		a += 5;
	}
	
	public static void function(Person p){
		p.setName("will");
	}
}
