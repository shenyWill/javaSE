package cn.yuanwill.JUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitDemo {

	public static void main(String[] args) {
		System.out.println("hahah");
	}
	
	@Test
	public void test(){
		System.out.println("hello JUnit");
	}
	
	@Before
	public void beforeTest(){
		System.out.println("before test");
	}
	
	@After
	public void afterTest(){
		System.out.println("after test");
	}

}
