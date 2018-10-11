package cn.yuanwill.polymorphic;

public class CatTest {
	public static void main(String[] args) {
		Animal cat = new Cat();
		cat.eat();
		
		System.out.println(cat instanceof Animal);
	}

}
