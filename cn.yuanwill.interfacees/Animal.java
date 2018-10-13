package cn.yuanwill.interfaceses;

public abstract class Animal {
	public abstract void eat();
	
	public static Animal getInstance(){
		return new Cat();
	}
}
