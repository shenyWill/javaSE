package cn.yuanwill.threadMore;

public class TicketSync implements Runnable {
	private int ticketNum = 100;

	@Override
	public void run() {
		payTicket();
	}

	private synchronized void payTicket() {
		while(true) {
			if (ticketNum > 0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "...." + ticketNum--);
			}
		}
		
	}

}
