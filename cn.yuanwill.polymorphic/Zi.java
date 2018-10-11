package cn.yuanwill.polymorphic;

public class Zi extends Fu {
	public int a = 3;
	private int b;
	
	public void show(){
		System.out.println("Zi show..." + this.b);
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
