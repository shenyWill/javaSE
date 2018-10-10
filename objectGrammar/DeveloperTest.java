package cn.yuanwill.variable;

public class DeveloperTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Developer deve = new Developer();
		deve.name = "yuan";
		System.out.println(deve.name);
		deve.work();
		deve.print();
		
		Maintain main = new Maintain();
		main.name = "will";
		main.work();
		main.maintain();
	}

}
