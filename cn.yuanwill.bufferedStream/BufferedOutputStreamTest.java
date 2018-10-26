package cn.yuanwill.bufferedStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class BufferedOutputStreamTest {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\test1.txt");
		FileOutputStream fos = new FileOutputStream(file);
		
		BufferedOutputStream bops = new BufferedOutputStream(fos);
		bops.write("helloworld".getBytes());
		bops.close();
	}

}
