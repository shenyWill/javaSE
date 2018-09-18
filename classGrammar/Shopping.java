import java.util.ArrayList;
public class Shopping{
    public static void main(String[] args) {
        ArrayList<Goods> goodArray = new ArrayList<Goods>();
        savaGoods(goodArray);
        System.out.println(goodArray);
        System.out.println(goodArray.get(2).size);
    }

    public static void savaGoods(ArrayList<Goods> goodArray){
        Goods good1 = new Goods();
        Goods good2 = new Goods();
        Goods good3 = new Goods();

        good1.brand = "macBook";
        good1.count = 10;
        good1.price = 45667.7;
        good1.size = 15.6;

        good2.brand = "HUAWEI";
        good1.count = 52;
        good1.price = 6987.7;
        good1.size = 18.6;

        goodArray.add(good1);
        goodArray.add(good2);
        goodArray.add(good3);
    }
}