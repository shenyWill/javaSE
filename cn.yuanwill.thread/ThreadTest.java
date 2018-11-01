package cn.yuanwill.thread;

public class ThreadTest {

	public static void main(String[] args) {
		SubThread st = new SubThread();
//		st.start();
//		for (int i = 0; i < 99; i++) {
//			System.out.println("main....." + i);
//		}
		System.out.println(st.getName());
		
		// 获取main方法的当前线程名
		System.out.println(Thread.currentThread().getName());
		
		SubThread st1 = new SubThread("haha");
		System.out.println(st1.getName());
	}

}
