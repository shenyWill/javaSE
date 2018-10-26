package cn.yuanwill.outputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\test.txt");
		try {
			InputStream is = new FileInputStream(file);
			int i = 0;
			try {
				/*
				 * read() 调用一次读取一次字节，每次都读取下一个字节
				 */
				i = is.read();
				i = is.read();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println((char)i);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
