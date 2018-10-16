package cn.yuanwill.bigInteger;

import java.math.BigDecimal;

public class BigDecimalTest {

	/**
	 * 精确计算类：bigDecimal
	 * @param args
	 */
	public static void main(String[] args) {
		BigDecimal bd = new BigDecimal("0.09");
		BigDecimal bd1 = new BigDecimal("0.01");
		
		BigDecimal bd2 = bd.add(bd1);
		System.out.println(bd2);
		
		BigDecimal bd3 = bd.subtract(bd1);
		System.out.println(bd3);
		
		BigDecimal bd4 = bd.multiply(bd1);
		System.out.println(bd4);
	}

}
