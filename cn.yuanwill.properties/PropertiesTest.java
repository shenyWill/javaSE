package cn.yuanwill.property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {

	public static void main(String[] args) throws IOException {
//		getPro();
		store();
	}
	
	public static void SetProperties(){
		Properties pro = new Properties();
		pro.setProperty("a", "1");
		pro.setProperty("b", "2");
		pro.setProperty("c", "3");
		System.out.println(pro);
		
		String value = pro.getProperty("a");
		System.out.println(value);
		
		// 方法stringPropertyNames,讲集合中的键存储到set集合中
		Set<String> set = pro.stringPropertyNames();
		for (String string : set) {
			System.out.println(pro.getProperty(string));
		}
	}
	
	// 将.properties文件写入pro集合中
	public static void getPro() throws IOException{
		Properties pro = new Properties();
		FileInputStream fr = new FileInputStream("E:\\code\\javaWork\\test\\src\\cn\\yuanwill\\property\\pro.properties");
		pro.load(fr);
		fr.close();
		System.out.println(pro);
	}
	
	// 将pro集合写入文件中
	public static void store() throws IOException{
		FileOutputStream fos = new FileOutputStream("E:\\code\\javaWork\\test\\src\\cn\\yuanwill\\property\\pro1.properties");
		Properties pro = new Properties();
		pro.setProperty("name", "zhangsan");
		pro.setProperty("age", "14");
		pro.setProperty("email", "775486@qq.com");
		pro.store(fos, "I want to copy");
	}

}
