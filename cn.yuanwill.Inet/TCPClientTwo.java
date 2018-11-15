package cn.yuanwill.Inet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientTwo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 8000);
		
		// ��ȡͼƬ д�������
		OutputStream out = socket.getOutputStream();
		
		// ��������������ȡ����ͼƬ
		FileInputStream fis = new FileInputStream("C:\\Users\\shenyuan\\Desktop\\ss.jpg");
		int len = 0;
		byte[] bytes = new byte[1024];
		while((len = fis.read(bytes)) != -1) {
			out.write(bytes,0,len);
		}
		
		socket.shutdownOutput();
		
		// ��ȡ�ֽ�����������ȡ���������ϴ��ɹ�
		InputStream in = socket.getInputStream();
		len = in.read(bytes);
		System.out.println(new String(bytes,0,len));
		
		fis.close();
		socket.close();
	}

}
