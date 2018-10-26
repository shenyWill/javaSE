package cn.yuanwill.outputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) throws IOException {
		readUTF();
	}
	
	// 读取UTF-8的文件
	public static void readUTF() throws IOException{
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\test1.txt");
		FileInputStream fis = new FileInputStream(file);
		
		// 创建转换流
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
		char[] b = new char[(int) file.length()];
		isr.read(b);
		System.out.println(new String(b));
		isr.close();
	}
	

}
