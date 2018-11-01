package cn.yuanwill.thread;

public class subClassThreadTest {

	public static void main(String[] args) {
		
		
		// 匿名内部类的方式开线程
		new Thread(){
			public void run() {
				System.out.println("!!!");
			}
		}.start();
		
		
		
		// 匿名内部类的方式开线程二
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("...");
			}
		}).start();
		
		
		
	}

}
