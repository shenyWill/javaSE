package cn.yuanwill.executors;

public class ThreadPoolRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("sss");
		
		// �鿴���߳���
		System.out.println(Thread.currentThread().getName());
	}

}
