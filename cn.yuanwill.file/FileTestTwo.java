package cn.yuanwill.file;

import java.io.File;

public class FileTestTwo {

	public static void main(String[] args) {
		function_7();
	}
	
	/*
	 * ��ȡ�ļ�����
	 */
	public static void function_1(){
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\test.txt");
		String name = file.getName();
		System.out.println(name);
	}
	
	/*
	 * ��ȡ�ļ��ֽ���
	 */
	public static void function_2(){
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\test.txt");
		long length = file.length();
		System.out.println(length);
	}
	
	/*
	 * ��ȡ����·��
	 */
	public static void function_3(){
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\test.txt");
		File filePath = file.getAbsoluteFile();
		System.out.println(file);
	}

	/*
	 * ��ȡ����·��
	 */
	public static void function_4(){
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\test.txt");
		File parentFile = file.getParentFile();
		File parentparentFile = parentFile.getParentFile();
		System.out.println(parentFile);
		System.out.println(parentparentFile);
	}
	
	/*
	 * �ж�·���Ƿ����
	 */
	public static void function_5(){
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\test.txt");
		boolean b = file.exists();
		System.out.println(b);
	}
	
	/*
	 * �ж�·���Ƿ�Ϊ�ļ���
	 */
	public static void function_6(){
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test");
		boolean b = file.isDirectory();
		System.out.println(b);
	}
	
	/*
	 * �ж�·���Ƿ�Ϊ�ļ�
	 */
	public static void function_7(){
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\test.txt");
		boolean b = file.isFile();
		System.out.println(b);
	}
}
