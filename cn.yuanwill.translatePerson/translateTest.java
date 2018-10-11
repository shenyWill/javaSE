package cn.yuanwill.translatePerson;

public class translateTest {
	public static void main(String[] args) {
		Person p = new Student();
		p.eat();
		
		Student stud = (Student)p;
		stud.study();
		stud.eat();
	}

}
