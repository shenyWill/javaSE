package cn.yuanwill.API;

public class TestEquals {
	public static void main(String[] args) {
		Person p1 = new Person("yuan", 12);
		Person p2 = new Person("will", 23);
		Person p3 = p1;
//		System.out.println(p1.equals(p3));
		
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3); 
		System.out.println(s1.equals(s3)); 
	}
}
