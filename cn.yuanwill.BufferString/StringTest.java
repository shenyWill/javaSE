package cn.yuanwill.String;

public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "javahahahajavajhadhfasdfajavajava";
		getJava(0, s);
	}
	
	public static void getJava(int i, String s) {
		if(s.indexOf("java") > -1) {
			i++;
			s= s.substring(s.indexOf("java"));
			getJava(i, s);
		}else {
			System.out.println(i);
		}
	}

}
