package cn.yuanwill.polymorphic;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fu fuzi = new Zi();
		fuzi.show();
		System.out.println(fuzi.a);
		
		fuzi.setB(100);
		fuzi.show();
		
		Smoking smkstud = new Student();
		smkstud.smok();

	}

}
