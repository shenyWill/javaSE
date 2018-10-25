package cn.yuanwill.file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		String pathSeparator = File.pathSeparator;
		System.out.println(pathSeparator);
		
		String separator = File.separator;
		System.out.println(separator);
		
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test.txt");
		System.out.println(file);
		
		function_5();
	}
	
	public static void function_1(){
		File file = new File("c:", "windows");
		System.out.println(file);
	}
	
	public static void function_2(){
		File parent = new File("d:");
		File file = new File(parent, "windows");
		System.out.println(file);
	}
	
	/*
	 * file.createNewFile()创建一个文件，如果不存在创建文件，存在不创建返回false
	 */
	public static void function_3() throws IOException{
		File file = new File("C:\\Users\\shenyuan\\Desktop\\tests.txt");
		boolean b = file.createNewFile();
		System.out.println(b);
	}
	
	/*
	 * file.mkdir()创建一个文件夹
	 * file.mkdirs()创建多层文件夹
	 */
	public static void function_4(){
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\haha");
		boolean b = file.mkdirs();
		System.out.println(b);
	}
	
	/*
	 * 
	 */
	public static void function_5(){
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\haha");
		boolean b = file.delete();
		System.out.println(b);
	}

}
