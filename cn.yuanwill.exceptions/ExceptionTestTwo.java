package cn.yuanwill.exceptions;

public class ExceptionTestTwo {

	public static void main(String[] args) {
		try{
			getInt(0);
		}catch(Exception e){
			System.out.println(e);
		}finally {
			System.out.println("haha");
		}
		System.out.println("lala");
	}
	
	public static void getInt(int a) throws Exception {
		if(a == 0) {
			throw new Exception("’‚ «“Ï≥£");
		}
	}

}
