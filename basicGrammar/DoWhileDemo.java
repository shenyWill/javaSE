public class DoWhileDemo{
    public static void main(String[] args) {
        int sum = 0;
        int i =1;
        do {
            sum += i;
            i++;
        }while(i < 10);
        System.out.println(sum);
    }
}