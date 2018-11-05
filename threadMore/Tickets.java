package cn.yuanwill.threadMore;

public class Tickets implements Runnable {
	
	// 定义总票数
	private int ticketNum = 100;

	@Override
	public void run() {
		while(true) {
			if (ticketNum > 0) {
				System.out.println("出售第" + ticketNum-- + "..." + Thread.currentThread().getName());
			}
		}
	}

}
