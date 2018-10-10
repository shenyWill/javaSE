package cn.yuanwill.variable;

public class AndroidPhone extends Phone {
	public void call(int a){
		super.call();
		System.out.println("androidPhone call..." + a);
	}
}
