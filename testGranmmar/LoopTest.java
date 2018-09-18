public class LoopTest{
    public static void main(String[] args) {
        int handleBit = 0;
        int tenBit = 0;
        int oneBit = 0;
        for(int i=100; i<1000; i++){
            handleBit = i / 100;
            tenBit = i / 10 % 10;
            oneBit = i % 10; 
            if(i == (handleBit * handleBit * handleBit + tenBit * tenBit* tenBit + oneBit * oneBit * oneBit)) {
                System.out.println(i);
            }
        }
    }
}