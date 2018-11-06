package cn.yuanwill.threadMore;

public class TicketSyncTest {

	public static void main(String[] args) {
		TicketSync ts = new TicketSync();
		Thread t0 = new Thread(ts);
		Thread t1 = new Thread(ts);
		Thread t2 = new Thread(ts);
		t0.start();
		t1.start();
		t2.start();
	}

}
