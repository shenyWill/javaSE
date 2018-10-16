package cn.yuanwill.date;

import java.util.Calendar;

public class CalendarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "..." + month + "..." + day);
		
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.YEAR, 1992);
		c1.set(Calendar.MONTH, 6);
		c1.set(Calendar.DAY_OF_MONTH, 1);
		System.out.println(c1.get(Calendar.YEAR) + "..." + (c1.get(Calendar.MONTH) + 1) + "..." + c1.get(Calendar.DAY_OF_MONTH));
		
		Calendar c2 = Calendar.getInstance();
		c2.set(1992,6,1);
		System.out.println(c2.get(Calendar.YEAR) + "..." + (c2.get(Calendar.MONTH) + 1) + "..." + c2.get(Calendar.DAY_OF_MONTH));
		
		Calendar c3 = Calendar.getInstance();
		c3.add(Calendar.DAY_OF_MONTH, 100);
		System.out.println(c3.get(Calendar.YEAR) + "..." + (c3.get(Calendar.MONTH) + 1) + "..." + c3.get(Calendar.DAY_OF_MONTH));
	}

}
