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
		
		bw.write("���".toCharArray());
		
		// ���еĻ��з��� ��\r\n���ã���Ϊ����ƽ̨�޹���
		// window \r\n
		// linux \n
		bw.newLine();
		bw.flush();
		
		bw.write("����".toCharArray());
		bw.newLine();
		bw.flush();
		bw.close();
	}

}
