package cn.yuanwill.Math;

import java.util.Random;

public class MathTest {
	public static void main(String[] args) {
		
		int i = Math.abs(-9);
		System.out.println(i);
		
		double d = Math.ceil(5.11);
		System.out.println(d);
		
		double d1 = Math.floor(5.11);
		System.out.println(d1);
		
		double d2 = Math.random();
		System.out.println(d2);
		
		Random ra = new Random();
		int i1 = ra.nextInt();
		System.out.println(i1);
		
		double d3 = Math.round(2.63);
		System.out.println(d3);
	}

}
