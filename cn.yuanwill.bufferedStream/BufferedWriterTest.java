package cn.yuanwill.bufferedStream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\test1.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("你好".toCharArray());
		
		// 独有的换行方法 比\r\n更好，因为具有平台无关性
		// window \r\n
		// linux \n
		bw.newLine();
		bw.flush();
		
		bw.write("哈哈".toCharArray());
		bw.newLine();
		bw.flush();
		bw.close();
	}

}
