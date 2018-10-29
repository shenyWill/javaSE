package cn.yuanwill.commonStream;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class commonStreamTest {

	public static void main(String[] args) throws IOException {
		copyDirectory();
	}

	
	/*
	 * ���غ�׺��
	 */
	public static void getExtendName(){
		String fnu = FilenameUtils.getExtension("a.txt");
		System.out.println(fnu);
	}
	
	/*
	 * �ж��ļ�����׺�Ƿ�Ϊextension 
	 */
	public static void isExtension(){
		boolean b = FilenameUtils.isExtension("demo.java", "java");
		System.out.println(b);
	}
	
	/*
	 * ��ȡ�ı������ַ���
	 */
	public static void fileToString() throws IOException{
		String str = FileUtils.readFileToString(new File("E:\\code\\javaWork\\test\\src\\cn\\yuanwill\\printStream\\test.txt"));
		System.out.println(str);
	}
	
	/*
	 * �ַ���ת��Ϊ�ı�
	 */
	public static void stringToFile() throws IOException {
		String str = "dsadasdascacasc\r\n dasdasdasd";
		FileUtils.writeStringToFile(new File("E:\\code\\javaWork\\test\\src\\cn\\yuanwill\\commonStream\\test.txt"), str);
	}
	
	/*
	 * �����ļ�
	 */
	public static void copyFile() throws IOException{
		FileUtils.copyFile(
				new File("E:\\code\\javaWork\\test\\src\\cn\\yuanwill\\commonStream\\test.txt"), 
				new File("E:\\code\\javaWork\\test\\src\\cn\\yuanwill\\commonStream\\test1.txt")
				);
	}
	
	/*
	 * �����ļ���
	 */
	public static void copyDirectory() throws IOException{
		FileUtils.copyDirectory(
				new File("E:\\code\\javaWork\\test\\src\\cn\\yuanwill\\commonStream\\test"), 
				new File("E:\\code\\javaWork\\test\\src\\cn\\yuanwill\\commonStream\\test1")
				);
		
	}
}
