package cn.yuanwill.company;

public class Server extends Employee implements VIP {

	@Override
	public void VIP() {
		System.out.println("server vip...");
	}

	@Override
	public void work() {
		System.out.println("server is server");
	}

	public Server() {
		super();
		
	}

	public Server(String name, int age) {
		super(name, age);
		
	}
	
	

}
