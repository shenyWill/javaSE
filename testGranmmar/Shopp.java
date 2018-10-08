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
		System.out.println("你选择的是编辑功能");
		System.out.println("请选择修改的商品编号");
		Scanner sc = new Scanner(System.in);
		int ID = sc.nextInt();
		for (int i = 0; i < array.size(); i++) {
			FruitItem oldItem = array.get(i);
			if(oldItem.ID == ID) {
				System.out.println("请输入新的编号");
				FruitItem newItem = new FruitItem();
				newItem.ID = sc.nextInt();
				System.out.println("请输入新的名称");
				newItem.name = sc.next();
				System.out.println("请输入新的价格");
				newItem.price = sc.nextDouble();
				array.set(i, newItem);
				return;
			}
		}
		System.out.println("您输入的编号不存在！");
	}
	
	public static void deleteFruit(ArrayList<FruitItem> array){
		System.out.println("你选择的是删除功能");
		System.out.println("请输入商品编号");
		Scanner sc = new Scanner(System.in);
		int ID = sc.nextInt();
		for (int i = 0; i < array.size(); i++) {
			FruitItem item = array.get(i);
			if(item.ID == ID) {
				array.remove(i);
				System.out.println("删除成功");
				return;
			}
		}
		System.out.println("您输入的编号不存在！");
	}
	
	public static void addFruit(ArrayList<FruitItem> array) {
		System.out.println("选择的是添加商品功能");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入商品编号");
		int ID = sc.nextInt();
		System.out.println("请输入商品名字");
		String name = sc.next();
		System.out.println("请输入商品单价");
		double price = sc.nextDouble();
		FruitItem item = new FruitItem();
		item.ID = ID;
		item.name = name;
		item.price = price;
		array.add(item);
	}
	
	public static void showFruitItem(ArrayList<FruitItem> array){
		System.out.println();
		System.out.println("============= 商品库存请清单 ============");
		System.out.println("商品编号       商品名称                商品单价");
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i).ID + "     " + array.get(i).name + "      " + array.get(i).price);
		}
	}
	
	public static void mainMenu(){
		System.out.println();
		System.out.println("============= 欢迎光临ItCast超市  =============");
		System.out.println("1：货物清单  2：添加货物  3：删除货物  4：修改货物  5：退出");
		System.out.println("请您输入要操作的功能序号：");
	}
	
	public static int chooseFunction(){
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static void init(ArrayList<FruitItem> array){
		FruitItem f1 = new FruitItem();
		f1.ID = 1001;
		f1.name = "少林寺酥饼核桃";
		f1.price = 12.7;
		f1.number = 20;
		
		FruitItem f2 = new FruitItem();
		f2.ID = 1002;
		f2.name = "上炕杂粮牡丹饼";
		f2.price = 506;
		f2.number = 23;
		
		FruitItem f3 = new FruitItem();
		f3.ID = 1003;
		f3.name = "新疆原产哈密瓜";
		f3.price = 53.1;
		f3.number = 12;
		
		array.add(f1);
		array.add(f2);
		array.add(f3);
	}

}
