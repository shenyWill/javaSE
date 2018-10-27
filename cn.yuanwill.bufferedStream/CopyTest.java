package cn.yuanwill.bufferedStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {
	/*
	 * ʹ��buffer���ٶȻ��ԭ�ȵ�����
	 */
	public static void main(String[] args) throws IOException {
		// �õ�������
		File inputfile = new File("C:\\Users\\shenyuan\\Desktop\\test\\test1.txt");
		FileInputStream fis = new FileInputStream(inputfile);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		// �õ������
		File outputfile = new File("C:\\Users\\shenyuan\\Desktop\\test\\test2.txt");
		FileOutputStream fos = new FileOutputStream(outputfile);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		byte[] b = new byte[(int) inputfile.length()];
		
		bis.read(b);
		
		bos.write(b);
		
		bis.close();
		bos.close();
	}

}
