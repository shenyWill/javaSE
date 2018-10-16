package cn.yuanwill.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormateTest {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分钟ss秒");
		String date = sdf.format(new Date());
		System.out.println(date);
		
		String str = "2018年10月16日 11点54分钟55秒";
		Date date1 = sdf.parse(str);
		System.out.println(date1);
	}

}
