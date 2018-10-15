package cn.yuanwill.String;

public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "abcdefghijklmn";
		System.out.println(str.length());
		
		String str1 = str.substring(2, 3);
		System.out.println(str1);
		
		String str2 = "howareyou";
		System.out.println(str2.startsWith("hows"));
		System.out.println(str2.endsWith("you"));
		
		String str3 = "yuanwillissuccessd";
//		System.out.println(str3.contains("success"));
		System.out.println(str3.indexOf("a"));
		System.out.println(str3.indexOf("oooo"));
		
		String str4 = "yuan";	
		byte [] bytes = str4.getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}
		char[] chars = str4.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}
		
		String str5 = "haha";
		String str6 = "HAha";
		System.out.println(str5.equals(str6));
		System.out.println(str5.equalsIgnoreCase(str6));
	}

}
