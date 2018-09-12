import java.util.Random;
import java.util.Scanner;
public class GuessNumber{
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        int correntNum = ran.nextInt(100);
        int guessNum = sc.nextInt();
        while(correntNum != guessNum) {
            if (correntNum > guessNum) {
                System.out.println("so small!");
            }else {
                System.out.println("so big!");
            }
            guessNum = sc.nextInt();
        }
        System.out.print("yes");
    }
}