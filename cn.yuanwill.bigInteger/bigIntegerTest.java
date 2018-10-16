package cn.yuanwill.bigInteger;

import java.math.BigInteger;

public class bigIntegerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger bi = new BigInteger("1561565615615615615615615615654561211564561123156");
		System.out.println(bi);
		
		BigInteger bi1 = new BigInteger("156156561561561561561561561534234654561211564561123156");
		System.out.println(bi1);
		
		BigInteger bi2 = bi.add(bi1);
		System.out.println(bi2);
		
		BigInteger bi3 = bi2.subtract(bi1);
		System.out.println(bi3);
	}

}
