import java.util.Scanner;
public class MethodDemo_1{
    public static void main(String[] args) {
        printRect();
        // int i = scannerNum();
        // System.out.println(i);
        printNum(3, 5);
        System.out.println(computeAverageNum(2, 9, 7));
    }

    public static void printRect(){
        for(int i=0; i<3;i++){
            System.out.println("***");
        }
    }

    public static int scannerNum() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        return i;
    }

    public static void printNum(int m, int n) {
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int computeAverageNum(int i, int j, int k) {
        return (i+j+k)/3;
    }
}