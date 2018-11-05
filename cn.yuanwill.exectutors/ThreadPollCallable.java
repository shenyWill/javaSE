package cn.yuanwill.executors;

import java.util.concurrent.Callable;

public class ThreadPollCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		
		return "ss";
	}
	
}
