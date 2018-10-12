package cn.yuanwill.innerClass;
/*
 * 成员位置内部类，可以使用成员修饰符，public static ...
 */
public class Outer {
	private int a = 1;
	
	class inner{
		private int a = 2;
		public void innerFun(){
			int a = 3;
			System.out.println("inner function is: innerA: " + a);
			System.out.println("inner function is: thisA: " + this.a);
			System.out.println("inner function is: outerA: " + Outer.this.a);
			Outer.this.outerFun();
		}
	}
	
	public void outerFun(){
		System.out.println("this is outer function");
	}

}
