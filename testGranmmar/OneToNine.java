public class OneToNine{
    public static void main(String[] args) {
        int count = 0;
        for(int i=1; i < 100; i+=2){
            count += i;
        }
        System.out.println(count);
    }
}