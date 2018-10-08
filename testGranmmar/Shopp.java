import java.util.ArrayList;
import java.util.Scanner;


public class Shopp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<FruitItem> array = new ArrayList<FruitItem>();
		init(array);
		while(true) {
			mainMenu();
			int chooseCount = chooseFunction();
			switch (chooseCount) {
			case 1:
				showFruitItem(array);
				break;
			case 2:
				addFruit(array);
				break;
			case 3:
				deleteFruit(array);
				break;
			case 4:
				editFruit(array);
				break;
			case 5:
				return;
			default:
				
				break;
			}
		}
	}
	
	public static void editFruit(ArrayList<FruitItem> array){
		System.out.println("��ѡ����Ǳ༭����");
		System.out.println("��ѡ���޸ĵ���Ʒ���");
		Scanner sc = new Scanner(System.in);
		int ID = sc.nextInt();
		for (int i = 0; i < array.size(); i++) {
			FruitItem oldItem = array.get(i);
			if(oldItem.ID == ID) {
				System.out.println("�������µı��");
				FruitItem newItem = new FruitItem();
				newItem.ID = sc.nextInt();
				System.out.println("�������µ�����");
				newItem.name = sc.next();
				System.out.println("�������µļ۸�");
				newItem.price = sc.nextDouble();
				array.set(i, newItem);
				return;
			}
		}
		System.out.println("������ı�Ų����ڣ�");
	}
	
	public static void deleteFruit(ArrayList<FruitItem> array){
		System.out.println("��ѡ�����ɾ������");
		System.out.println("��������Ʒ���");
		Scanner sc = new Scanner(System.in);
		int ID = sc.nextInt();
		for (int i = 0; i < array.size(); i++) {
			FruitItem item = array.get(i);
			if(item.ID == ID) {
				array.remove(i);
				System.out.println("ɾ���ɹ�");
				return;
			}
		}
		System.out.println("������ı�Ų����ڣ�");
	}
	
	public static void addFruit(ArrayList<FruitItem> array) {
		System.out.println("ѡ����������Ʒ����");
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ʒ���");
		int ID = sc.nextInt();
		System.out.println("��������Ʒ����");
		String name = sc.next();
		System.out.println("��������Ʒ����");
		double price = sc.nextDouble();
		FruitItem item = new FruitItem();
		item.ID = ID;
		item.name = name;
		item.price = price;
		array.add(item);
	}
	
	public static void showFruitItem(ArrayList<FruitItem> array){
		System.out.println();
		System.out.println("============= ��Ʒ������嵥 ============");
		System.out.println("��Ʒ���       ��Ʒ����                ��Ʒ����");
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i).ID + "     " + array.get(i).name + "      " + array.get(i).price);
		}
	}
	
	public static void mainMenu(){
		System.out.println();
		System.out.println("============= ��ӭ����ItCast����  =============");
		System.out.println("1�������嵥  2����ӻ���  3��ɾ������  4���޸Ļ���  5���˳�");
		System.out.println("��������Ҫ�����Ĺ�����ţ�");
	}
	
	public static int chooseFunction(){
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static void init(ArrayList<FruitItem> array){
		FruitItem f1 = new FruitItem();
		f1.ID = 1001;
		f1.name = "�������ֱ�����";
		f1.price = 12.7;
		f1.number = 20;
		
		FruitItem f2 = new FruitItem();
		f2.ID = 1002;
		f2.name = "�Ͽ�����ĵ����";
		f2.price = 506;
		f2.number = 23;
		
		FruitItem f3 = new FruitItem();
		f3.ID = 1003;
		f3.name = "�½�ԭ�����ܹ�";
		f3.price = 53.1;
		f3.number = 12;
		
		array.add(f1);
		array.add(f2);
		array.add(f3);
	}

}
