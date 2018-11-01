package cn.yuanwill.thread;

public class RunTest {

	public static void main(String[] args) {
		SubRunnable sr = new SubRunnable();
		Thread th = new Thread(sr);
		th.start();
	}

}
