package cn.yuanwill.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTests {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		long nowDateLength = System.currentTimeMillis();
		SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd");
		Date birtardy = sdt.parse("1992-07-01");
		long birtadyLength = birtardy.getTime();
		long distanceTime = nowDateLength - birtadyLength;
		System.out.println(distanceTime/1000/60/60/24/360);
	}

}
