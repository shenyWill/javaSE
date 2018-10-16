package cn.yuanwill.date;

import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		long l = 1539660232582l;
		Date d = new Date(l);
		long time = System.currentTimeMillis();
		System.out.println(time);
		System.out.println(d);
		
		Date d1 = new Date();
		long time1 = d1.getTime();
		System.out.println(time1);
		
		d1.setTime(0);
		System.out.println(d1);
	}

}
