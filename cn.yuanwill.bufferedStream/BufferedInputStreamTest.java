package cn.yuanwill.bufferedStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamTest {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\test1.txt");
		FileInputStream fis = new FileInputStream(file);
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		byte[] b = new byte[(int) file.length()];
		
		bis.read(b);
		System.out.println(new String(b));
		bis.close();
		
	}

}
