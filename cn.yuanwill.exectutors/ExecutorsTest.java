package cn.yuanwill.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsTest {

	public static void main(String[] args) {
		// �����̳߳ض���
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		// ��һ��runnableʵ����Ķ���
		ThreadPoolRunnable tpr = new ThreadPoolRunnable();
		
		es.submit(tpr);
		es.submit(tpr);
		
		es.shutdown();
	}

}
