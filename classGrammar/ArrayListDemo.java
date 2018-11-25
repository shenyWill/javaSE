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

        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(4);
        arrayList2.add(5);

        arrayList2.add(2, 7);

        arrayList2.set(0, 111);

        arrayList2.remove(4);

        // arrayList2.clear();
        
        for(int i=0; i < arrayList2.size(); i++) {
            System.out.println(arrayList2.get(i));
        }
    }
}