package cn.yuanwill.file;

import java.io.File;

public class FileTestThree {

	public static void main(String[] args) {
//		function_4();
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test");
		function_5(file);
	}
	
	/*
	 * 获取文件夹中所有的文件和文件夹 字符串数组模式
	 */
	public static void function_1(){
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test");
		String[] strArr = file.list();
		for (String string : strArr) {
			System.out.println(string);
		}
	}
	
	/*
	 * 获取文件夹中所有的文件和文件夹 file数组模式
	 */
	public static void function_2(){
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test");
		File[] fileArr = file.listFiles();
		for (File file2 : fileArr) {
			System.out.println(file2);
		}
	}
	
	/*
	 * 获取所有根目录
	 */
	public static void function_3(){
		File[] fileArr = File.listRoots();
		for (File file : fileArr) {
			System.out.println(file);
		}
	}
	
	/*
	 * 文件获取的过滤器
	 */
	public static void function_4(){
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test");
		File[] fileArr = file.listFiles(new MyFileFilter());
		for (File file2 : fileArr) {
			System.out.println(file2);
		}
	}
	
	/*
	 * 遍历文件夹下所有的文件和文件夹
	 */
	public static void function_5(File file){
		File[] fileArr = file.listFiles();
		for (File file2 : fileArr) {
			if(file2.isDirectory()) {
				System.out.println(file2);
				function_5(file2);
			} else {
				System.out.println(file2);
			}
		}
	}
}
