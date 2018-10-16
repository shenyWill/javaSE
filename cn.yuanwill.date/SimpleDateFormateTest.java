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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH��mm����ss��");
		String date = sdf.format(new Date());
		System.out.println(date);
		
		String str = "2018��10��16�� 11��54����55��";
		Date date1 = sdf.parse(str);
		System.out.println(date1);
	}

}
