import java.lang.reflect.Array;
import java.util.ArrayList;
public class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("abc");
        arrayList.add("yuan");
        arrayList.add("will");
        int size = arrayList.size();
        String s = arrayList.get(1);
        System.out.println(size);
        System.out.println(s);
    }
}