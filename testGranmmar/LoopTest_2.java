public class LoopTest_2{
    public static void main(String[] args) {
        char smallChar = 'a';
        char bigChar = 'A';
        for(int i=0; i < 26; i++) {
            System.out.println(smallChar + " " + bigChar);
            smallChar++;
            bigChar++;
        }
    }
}