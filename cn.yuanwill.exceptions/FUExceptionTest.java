package cn.yuanwill.exceptions;

public class FUExceptionTest {

	public static void main(String[] args) {
		try {
			double grade = getAvg(12,-23,45,59);
			System.out.println(grade);
		} catch (FUException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("hahaha");
	}
	
	public static double getAvg(double...source) throws FUException {
		double sum = 0;
		for (double i : source) {
			if (i < 0) {
				throw new FUException("负数不对！" + i);
			}
			sum += i;
		}
		return sum / source.length;
	}

}
