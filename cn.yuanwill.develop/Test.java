package cn.yuanwill.develop;

public class Test {
	public static void main(String[] args) {
		JavaEE jee = new JavaEE();
		jee.setName("yuan");
		jee.setId("123");
		System.out.println(jee.getName()+ "..." + jee.getId());
		jee.work();
		jee.money();
		
		NetWork net = new NetWork();
		net.work();
		net.setId("222");
		net.setName("will");
		System.out.println(net.getId() + "..." + net.getName());
	}

}
