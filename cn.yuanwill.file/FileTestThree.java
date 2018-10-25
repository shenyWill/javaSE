package cn.yuanwill.file;

import java.io.File;

public class FileTestThree {

	public static void main(String[] args) {
//		function_4();
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test");
		function_5(file);
	}
	
	/*
	 * ��ȡ�ļ��������е��ļ����ļ��� �ַ�������ģʽ
	 */
	public static void function_1(){
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test");
		String[] strArr = file.list();
		for (String string : strArr) {
			System.out.println(string);
		}
	}
	
	/*
	 * ��ȡ�ļ��������е��ļ����ļ��� file����ģʽ
	 */
	public static void function_2(){
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test");
		File[] fileArr = file.listFiles();
		for (File file2 : fileArr) {
			System.out.println(file2);
		}
	}
	
	/*
	 * ��ȡ���и�Ŀ¼
	 */
	public static void function_3(){
		File[] fileArr = File.listRoots();
		for (File file : fileArr) {
			System.out.println(file);
		}
	}
	
	/*
	 * �ļ���ȡ�Ĺ�����
	 */
	public static void function_4(){
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test");
		File[] fileArr = file.listFiles(new MyFileFilter());
		for (File file2 : fileArr) {
			System.out.println(file2);
		}
	}
	
	/*
	 * �����ļ��������е��ļ����ļ���
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
