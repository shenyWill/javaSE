package cn.yuanwill.executors;

public class ThreadPoolRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("sss");
		
		// 查看该线程名
		System.out.println(Thread.currentThread().getName());
	}

}
