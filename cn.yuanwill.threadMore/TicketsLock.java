package cn.yuanwill.threadMore;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketsLock implements Runnable {

	// ������Ʊ��
	private int ticketNum = 100;
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {
		lock.lock();
		while (true) {
			if (ticketNum > 0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println("���۵�" + ticketNum-- + "..." + Thread.currentThread().getName());
			}
			lock.unlock();
		}
		
	}

}
