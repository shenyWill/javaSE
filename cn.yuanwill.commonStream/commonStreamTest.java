package cn.yuanwill.commonStream;

import org.apache.commons.io.FilenameUtils;

public class commonStreamTest {

	public static void main(String[] args) {
		isExtension();
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
}
