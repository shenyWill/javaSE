package cn.yuanwill.innerClass;

import java.util.concurrent.locks.Lock;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.inner outInn = new Outer().new inner();
		outInn.innerFun();
		Lock lock = null;
	}

}
