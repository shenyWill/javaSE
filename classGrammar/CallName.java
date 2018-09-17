import java.util.ArrayList;
import java.util.ArrayList;
public class CallName {
    public static void main(String[] args) {
        ArrayList<StudentName> arrayName = new ArrayList<StudentName>();
        add(arrayName);
        printArrayList(arrayName);

    }

    public static void add(ArrayList<StudentName> arrayName) {
        StudentName sn1 = new StudentName();
        StudentName sn2 = new StudentName();
        StudentName sn3 = new StudentName();
        StudentName sn4 = new StudentName();
        StudentName sn5 = new StudentName();

        sn1.name = "yuanwill";
        sn1.age = 20;
        sn2.name = "yuanwill2";
        sn2.age = 202;
        sn3.name = "yuanwill3";
        sn3.age = 203;
        sn4.name = "yuanwill4";
        sn4.age = 204;
        sn5.name = "yuanwill5";
        sn5.age = 205;

        arrayName.add(sn1);
        arrayName.add(sn2);
        arrayName.add(sn3);
        arrayName.add(sn4);
        arrayName.add(sn5);
    }

    public static void printArrayList(ArrayList<StudentName> arrayName) {
        for(int i=0; i < arrayName.size(); i++){
            System.out.println(arrayName.get(i).name + ":" + arrayName.get(i).age);
        }
    }
}