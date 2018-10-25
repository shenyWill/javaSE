package cn.yuanwill.exceptions;

public class ExceptionTest {

	public static void main(String[] args) throws Exception {
		int[] arr = {}; 
//		getInt(arr);
		
		try {
			System.out.println(getIntTwo(arr));
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("haha:" + e);
		}
		System.out.println("hahha");
	}
	
	public static int getInt(int[] arr) throws Exception {
		if(arr == null) {
			throw new Exception("���鲻����");
		}
		if(arr.length == 0) {
			throw new Exception("����Ϊ��");
		}
		int i = arr[arr.length-1];
		return i;
	}
	
	public static int getIntTwo(int[] arr) throws NullPointerException,ArrayIndexOutOfBoundsException  {
		if (arr == null) {
			throw new NullPointerException("���鲻����");
		}
		if(arr.length == 0) {
			throw new ArrayIndexOutOfBoundsException("����Ϊ��");
		}
		int i = arr[arr.length-1];
		return i;
	}

}
