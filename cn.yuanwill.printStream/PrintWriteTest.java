package cn.yuanwill.printStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriteTest {

	public static void main(String[] args) throws FileNotFoundException {
		function_1();
	}
	
	public static void function() throws FileNotFoundException{
		File file = new File("E:\\code\\javaWork\\test\\src\\cn\\yuanwill\\printStream\\test.txt");
		PrintWriter pw = new PrintWriter(file);
		/*
		 * println 原样输出
		 * write 走字码表
		 */
		pw.println(100);
		pw.write(100);
		pw.flush();
		pw.close();
	}
	
	public static void function_1() throws FileNotFoundException{
		PrintWriter pw = new PrintWriter("E:\\code\\javaWork\\test\\src\\cn\\yuanwill\\printStream\\test.txt");
		pw.println(3.5);
		pw.close();
	}

}
