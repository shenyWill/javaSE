package cn.yuanwill.outputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamTestTwo {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\test.txt");
		@SuppressWarnings("resource")
		FileInputStream fis = new FileInputStream(file);
		byte[] b = new byte[(int) file.length()];
		int len = fis.read(b);
		System.out.println(new String(b));
		System.out.println(len);
	}

}
