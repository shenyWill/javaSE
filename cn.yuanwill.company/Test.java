package cn.yuanwill.company;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Manager manager = new Manager("yuan", 33, 123.45);
		manager.work();
		
		Server server = new Server("shen", 18);
		server.work();
		server.VIP();
		
		Cooker cooker = new Cooker();
		cooker.work();
		cooker.VIP();
	}

}
