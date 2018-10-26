package cn.yuanwill.outputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class OutputStreamWriterTest {

	public static void main(String[] args) throws IOException {
		writeGBK();
		writeUTF();
	}
	
	public static void writeGBK() throws IOException{
		// 创建字节输出流
		FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\shenyuan\\Desktop\\test\\test.txt"));
		
		// 创建转化流,使用GBK编码表，默认为GBK，所以不需要第二个参数
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		osw.write("你好");
		osw.flush();
		osw.close();
	}
	
	public static void writeUTF() throws IOException{
		// 创建字节输出流
		FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\shenyuan\\Desktop\\test\\test1.txt"));
		
		// 创建转化流,使用UTF-8编码表  在UTF中 一个汉字占用三个字节
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		
		osw.write("你好");
		osw.flush();
		osw.close();
	}

}
