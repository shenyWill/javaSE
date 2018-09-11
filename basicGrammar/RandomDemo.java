import java.util.Random;
public class RandomDemo{
	public static void main(String[] args){
		Random rd = new Random();
		double d = rd.nextDouble();
		double i = rd.nextInt(100);
		System.out.println(d);
		System.out.println(i);
	}
}