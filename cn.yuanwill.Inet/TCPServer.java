package cn.yuanwill.Inet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8888);
		Socket socket = server.accept();
		System.out.println(socket);
		
		// ��ȡ�ͻ��˷��͹�����������
		InputStream is = socket.getInputStream();
		byte[] data = new byte[1024];
		int len = is.read(data);
		System.out.println(new String(data,0,len));
		
		// ���ͻ��˷�������
		OutputStream os = socket.getOutputStream();
		os.write("server is accpected thankyou!".getBytes());
		
		socket.close();
		server.close();
	}

}
