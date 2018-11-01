package cn.yuanwill.thread;

public class SubThread extends Thread {

	@Override
	public void run() {
		
		super.run();
		for (int i = 0; i < 99; i++) {
				System.out.println("run...." + getName() + ".." + i);
		}
	}

	public SubThread(String arg0) {
		super(arg0);
		
	}

	public SubThread() {
		super();
		
	}
	
	
	
}
