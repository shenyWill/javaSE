package cn.yuanwill.outputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\test.txt");
		/*
		 * Readerֻ�ܶ�ȡ�ı��ļ�
		 */
		FileReader fr = new FileReader(file);
		char[] bt = new char[(int) file.length()];
		fr.read(bt);
		System.out.println(new String(bt));
		fr.close();
	}

}
