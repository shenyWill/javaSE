package cn.yuanwill.thread;

public class subClassThreadTest {

	public static void main(String[] args) {
		
		
		// �����ڲ���ķ�ʽ���߳�
		new Thread(){
			public void run() {
				System.out.println("!!!");
			}
		}.start();
		
		
		
		// �����ڲ���ķ�ʽ���̶߳�
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("...");
			}
		}).start();
		
		
		
	}

}
