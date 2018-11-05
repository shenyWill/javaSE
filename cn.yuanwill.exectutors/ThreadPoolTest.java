package cn.yuanwill.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	public static void main(String[] args) throws Exception {
		ExecutorService es = Executors.newFixedThreadPool(2);
		ThreadPollCallable tpr = new ThreadPollCallable();
		String s =tpr.call();
		System.out.println(s);
		es.submit(tpr);
		es.shutdown();
	}

}
