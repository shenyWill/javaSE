package cn.yuanwill.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsTest {

	public static void main(String[] args) {
		// 返回线程池对象
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		// 造一个runnable实现类的对象
		ThreadPoolRunnable tpr = new ThreadPoolRunnable();
		
		es.submit(tpr);
		es.submit(tpr);
		
		es.shutdown();
	}

}
