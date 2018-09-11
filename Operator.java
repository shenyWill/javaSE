public class Operator{
	public static void main(String[] args){
		System.out.println(false & true);
		System.out.println(false | true);
		
		System.out.println(false ^ true);
		System.out.println(true ^ false);
		System.out.println(true ^ true);
		System.out.println(false ^ false);

		System.out.println(!false);
		
		int i = 3;
		System.out.println(i > 5 && ++i > 3);
		System.out.println(i);
		
		System.out.println(true || ++i > 2);
		System.out.println(i);
	}
}