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
	 * 返回后缀名
	 */
	public static void getExtendName(){
		String fnu = FilenameUtils.getExtension("a.txt");
		System.out.println(fnu);
	}
	
	/*
	 * 判断文件名后缀是否为extension 
	 */
	public static void isExtension(){
		boolean b = FilenameUtils.isExtension("demo.java", "java");
		System.out.println(b);
	}
	
	/*
	 * 读取文本返回字符串
	 */
	public static void fileToString() throws IOException{
		String str = FileUtils.readFileToString(new File("E:\\code\\javaWork\\test\\src\\cn\\yuanwill\\printStream\\test.txt"));
		System.out.println(str);
	}
	
	/*
	 * 字符串转换为文本
	 */
	public static void stringToFile() throws IOException {
		String str = "dsadasdascacasc\r\n dasdasdasd";
		FileUtils.writeStringToFile(new File("E:\\code\\javaWork\\test\\src\\cn\\yuanwill\\commonStream\\test.txt"), str);
	}
	
	/*
	 * 复制文件
	 */
	public static void copyFile() throws IOException{
		FileUtils.copyFile(
				new File("E:\\code\\javaWork\\test\\src\\cn\\yuanwill\\commonStream\\test.txt"), 
				new File("E:\\code\\javaWork\\test\\src\\cn\\yuanwill\\commonStream\\test1.txt")
				);
	}
	
	/*
	 * 复制文件件
	 */
	public static void copyDirectory() throws IOException{
		FileUtils.copyDirectory(
				new File("E:\\code\\javaWork\\test\\src\\cn\\yuanwill\\commonStream\\test"), 
				new File("E:\\code\\javaWork\\test\\src\\cn\\yuanwill\\commonStream\\test1")
				);
		
	}
}
