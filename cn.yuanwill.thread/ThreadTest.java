package cn.yuanwill.thread;

public class ThreadTest {

	public static void main(String[] args) {
		SubThread st = new SubThread();
		st.start();
		for (int i = 0; i < 99; i++) {
			System.out.println("main....." + i);
		}
	}

}
