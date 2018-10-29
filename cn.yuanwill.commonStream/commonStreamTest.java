package cn.yuanwill.commonStream;

import org.apache.commons.io.FilenameUtils;

public class commonStreamTest {

	public static void main(String[] args) {
		isExtension();
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
}
