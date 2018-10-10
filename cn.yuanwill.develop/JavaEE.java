package cn.yuanwill.develop;

public class JavaEE extends Develop {

	@Override
	public void money() {
		System.out.println("JavaEE get money...");
	}

	@Override
	public void work() {
		System.out.println("JavaEE is working..." + super.getName() + "..." + super.getId());
	}

}
