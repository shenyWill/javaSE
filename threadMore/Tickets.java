package cn.yuanwill.threadMore;

public class Tickets implements Runnable {
	
	// ������Ʊ��
	private int ticketNum = 100;

	@Override
	public void run() {
		while(true) {
			if (ticketNum > 0) {
				System.out.println("���۵�" + ticketNum-- + "..." + Thread.currentThread().getName());
			}
		}
	}

}
