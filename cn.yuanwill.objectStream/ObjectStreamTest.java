package cn.yuanwill.ObjectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectStreamTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		function();
	}
	
	public static void function() throws IOException, ClassNotFoundException{
		FileOutputStream fos = new FileOutputStream("E:\\code\\javaWork\\test\\src\\cn\\yuanwill\\ObjectStream\\person.txt");
		ObjectOutputStream oop = new ObjectOutputStream(fos);
		Person p = new Person("yuan", 34, "7784@qq.com");
		oop.writeObject(p);
		oop.close();
		
		FileInputStream fis = new FileInputStream("E:\\code\\javaWork\\test\\src\\cn\\yuanwill\\ObjectStream\\person.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object p1 =ois.readObject();
		ois.close();
		System.out.println(p1);
	}

}
