public class BreakDemo{
    public static void main(String[] args) {
        int i = 1;
        while(true) {
            if(i==3) {
                break;
            }
            System.out.println(i);
            i++;
        }

        for(int j = 0; j< 10; j++) {
            System.out.println(j);
            if(j == 5) {
                break;
            }
        }

        for(int k = 0; k< 10; k++) {
            if(k == 5) {
                continue;
            }
            System.out.println(k);
        }
        // break a可以结束所有循环，break结束当前循环；
        a:for(int t =0; t<10; t++) {
            for(int g =0; g<5; g++){
                System.out.println("g=" + g);
                if(g ==3) {
                    break a;
                }
            }
            System.out.println("t=" + t);
        }
    }
}