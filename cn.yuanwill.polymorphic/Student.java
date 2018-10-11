package cn.yuanwill.polymorphic;

public class Student implements Smoking {

	@Override
	public void smok() {
		System.out.println("student is smoking..");
	}

}
