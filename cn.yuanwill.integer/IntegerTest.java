package cn.yuanwill.parseNumber;

public class IntegerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = Integer.parseInt("-12");
		System.out.println(i);
		Integer i1 = new Integer("1111");
		int i2 = i1.intValue();
		System.out.println(--i1);
		System.out.println(i2);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		Integer iii = 1;
		
		Integer i3 = 1;
		Integer i4 = 1;
		System.out.println(i3 == i4);
		System.out.println(i3.equals(i4));
		System.out.println(i3.equals(1));
		
		Integer i5 = new Integer(2);
		Integer i6 = new Integer(2);
		System.out.println(i5 == i6);
		System.out.println(i5.equals(i6));
		
		System.out.println("-------------");
		
		Integer i7 = 128;
		Integer i8 = 128;
		System.out.println(i7 == i8);
		System.out.println(i7.equals(i8));
		System.out.println(i7.equals(128));
	}

}
