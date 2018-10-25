package cn.yuanwill.file;

import java.io.File;

public class FileTestTwo {

	public static void main(String[] args) {
		function_7();
	}
	
	/*
	 * 获取文件名字
	 */
	public static void function_1(){
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\test.txt");
		String name = file.getName();
		System.out.println(name);
	}
	
	/*
	 * 获取文件字节数
	 */
	public static void function_2(){
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\test.txt");
		long length = file.length();
		System.out.println(length);
	}
	
	/*
	 * 获取绝对路径
	 */
	public static void function_3(){
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\test.txt");
		File filePath = file.getAbsoluteFile();
		System.out.println(file);
	}

	/*
	 * 获取父级路径
	 */
	public static void function_4(){
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\test.txt");
		File parentFile = file.getParentFile();
		File parentparentFile = parentFile.getParentFile();
		System.out.println(parentFile);
		System.out.println(parentparentFile);
	}
	
	/*
	 * 判断路径是否存在
	 */
	public static void function_5(){
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\test.txt");
		boolean b = file.exists();
		System.out.println(b);
	}
	
	/*
	 * 判断路径是否为文件夹
	 */
	public static void function_6(){
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test");
		boolean b = file.isDirectory();
		System.out.println(b);
	}
	
	/*
	 * 判断路径是否为文件
	 */
	public static void function_7(){
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\test.txt");
		boolean b = file.isFile();
		System.out.println(b);
	}
}
