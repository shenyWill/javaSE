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
		// �����ֽ������
		FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\shenyuan\\Desktop\\test\\test.txt"));
		
		// ����ת����,ʹ��GBK�����Ĭ��ΪGBK�����Բ���Ҫ�ڶ�������
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		osw.write("���");
		osw.flush();
		osw.close();
	}
	
	public static void writeUTF() throws IOException{
		// �����ֽ������
		FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\shenyuan\\Desktop\\test\\test1.txt"));
		
		// ����ת����,ʹ��UTF-8�����  ��UTF�� һ������ռ�������ֽ�
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		
		osw.write("���");
		osw.flush();
		osw.close();
	}

}
