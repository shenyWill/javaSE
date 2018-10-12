package cn.yuanwill.finals;
/*
 * final 类不可以被继承
 * final 方法不可以重写
 */
public class Fu {
	public final int a = 100;
	public final void show(){
		System.out.println("this is final show");
	}
	
	public void fuc(){
		System.out.println("this is normal fuc");
	}
}
