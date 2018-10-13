package cn.yuanwill.company;

public class Cooker extends Employee implements VIP {

	public Cooker(String name, int age) {
		super(name, age);
		
	}
	public Cooker(){
		super();
	}

	@Override
	public void VIP() {
		System.out.println("cooker vip...");
	}

	@Override
	public void work() {
		System.out.println("cooker is cooking");
	}

}
