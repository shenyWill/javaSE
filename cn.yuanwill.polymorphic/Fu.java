package cn.yuanwill.polymorphic;

public class Fu {
	public int a = 5;
	private int b;
	public void show(){
		System.out.println("Fu show..." + this.b);
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}

}
