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
		
		// ����stringPropertyNames,�������еļ��洢��set������
		Set<String> set = pro.stringPropertyNames();
		for (String string : set) {
			System.out.println(pro.getProperty(string));
		}
	}
	
	// ��.properties�ļ�д��pro������
	public static void getPro() throws IOException{
		Properties pro = new Properties();
		FileInputStream fr = new FileInputStream("E:\\code\\javaWork\\test\\src\\cn\\yuanwill\\property\\pro.properties");
		pro.load(fr);
		fr.close();
		System.out.println(pro);
	}
	
	// ��pro����д���ļ���
	public static void store() throws IOException{
		FileOutputStream fos = new FileOutputStream("E:\\code\\javaWork\\test\\src\\cn\\yuanwill\\property\\pro1.properties");
		Properties pro = new Properties();
		pro.setProperty("name", "zhangsan");
		pro.setProperty("age", "14");
		pro.setProperty("email", "775486@qq.com");
		pro.store(fos, "I want to copy");
	}

}
