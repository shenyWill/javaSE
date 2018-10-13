package cn.yuanwill.interfaceses;

import java.util.Calendar;

public class TestArguments implements Smoking {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestArguments ts = new TestArguments();
		noSmoking(ts);
		
		new getSmoking().getSmoking().moking();
		
		Animal animal = Animal.getInstance();
		animal.eat();
		
		Calendar c = Calendar.getInstance();
		
	}
	
	public static void noSmoking(Smoking smok){
		smok.moking();
	}

	@Override
	public void moking() {
		System.out.println("no smoking");
	}

}
