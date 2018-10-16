package cn.yuanwill.regexp;

public class RegexpTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String qq= "123356";
		boolean b = qq.matches("[1-9][\\d]{4,9}");
		System.out.println(b);
		System.out.println("13826566732".matches("1[34578][\\d]{9}"));
		
		String [] strArr = "12-56-86-985".split("-");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		System.out.println();
		String [] strArr2 = "172.168.19.22".split("\\.");
		for (int i = 0; i < strArr2.length; i++) {
			System.out.println(strArr2[i]);
		}
		
		String str = "Hello12345World6789012";
		String str1 = str.replaceAll("[\\d]+", "#");
		System.out.println(str1);
		
		String email = "abc123@sina.com";
		boolean bb = email.matches("^[a-zA-Z0-9_]+@[0-9a-z]+\\.[a-z]+$");
		System.out.println(bb);
	}

}
