package cn.yuanwill.variable;

public class Person {
	private String name;
	private int age;
	
	public void speak(){
		String name = "will";
		int age = 22;
		System.out.println(this.name + "..." + age);
	}
	
	public void setAge(int age){
		if(age < 0 || age > 100) {
			this.age = 20;
		}else {
			this.age = age;
		}
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Boolean compareAge(Person p) {
		return this.age == p.age;
		
	}
}
