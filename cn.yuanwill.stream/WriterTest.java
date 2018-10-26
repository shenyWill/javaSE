package cn.yuanwill.outputStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\test.txt");
		FileWriter fw = new FileWriter(file);
		char[] c = {'s', 'd', 's'};
		fw.write(c);
		fw.flush();
		fw.close();
	}

}
