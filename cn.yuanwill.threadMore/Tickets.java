package cn.yuanwill.threadMore;

public class Tickets implements Runnable {
	
	// ������Ʊ��
	private int ticketNum = 100;
	private Object obj = new Object();

	@Override
	public void run() {
		while(true) {
			synchronized (obj) {
				if (ticketNum > 0) {
					System.out.println("���۵�" + ticketNum-- + "..." + Thread.currentThread().getName());
				}
			}
			
		}
	}

}
