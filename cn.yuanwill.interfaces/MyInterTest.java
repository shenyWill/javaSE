package cn.yuanwill.interfaces;

public class MyInterTest {

	public static void main(String[] args) {
		System.out.println(MyInter.a);
		MyInterImpl mii = new MyInterImpl();
		mii.function();
	}
}
