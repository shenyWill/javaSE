package cn.yuanwill.company;

public class Manager extends Employee {
	private double money;

	@Override
	public void work() {
		System.out.println("manager is working..");
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public Manager(String name, int age, double money) {
		super(name, age);
		this.money = money;
	}

	public Manager() {
		super();
		
	}
	

}
