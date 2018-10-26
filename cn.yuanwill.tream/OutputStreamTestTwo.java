package cn.yuanwill.outputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamTestTwo {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\test.txt");
		FileOutputStream fos = new FileOutputStream(file, true);
		fos.write("hello\r\n".getBytes());
		fos.write("world\r\n".getBytes());
		fos.close();
	}

}
