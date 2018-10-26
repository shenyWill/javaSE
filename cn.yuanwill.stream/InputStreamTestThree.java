package cn.yuanwill.outputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamTestThree {

	public static void main(String[] args) {
		long s = System.currentTimeMillis();
		File inputFile = new File("C:\\Users\\shenyuan\\Desktop\\test\\test.txt");
		File outputFile = new File("C:\\Users\\shenyuan\\Desktop\\test\\test1.txt");
		byte[] b = new byte[(int) inputFile.length()];
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(inputFile);
			fis.read(b);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(outputFile);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			fos.write(b);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try {
			fis.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try {
			fos.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		long s1 = System.currentTimeMillis();
		System.out.println(s);
		System.out.println(s1);
	}

}
