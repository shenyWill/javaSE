package cn.yuanwill.thread;

public class SubRunnable implements Runnable {
	

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("run...." + i);
		}
	}

}
