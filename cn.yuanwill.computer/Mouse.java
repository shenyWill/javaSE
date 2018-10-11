package cn.yuanwill.computer;

public class Mouse implements Interface {

	@Override
	public void setIn() {
		System.out.println("mouse set in....");
	}

	@Override
	public void setOut() {
		System.out.println("mouse set out....");
	}

}
