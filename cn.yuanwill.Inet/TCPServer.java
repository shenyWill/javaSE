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
		
		// 获取客户端发送过来的输入流
		InputStream is = socket.getInputStream();
		byte[] data = new byte[1024];
		int len = is.read(data);
		System.out.println(new String(data,0,len));
		
		// 给客户端返回数据
		OutputStream os = socket.getOutputStream();
		os.write("server is accpected thankyou!".getBytes());
		
		socket.close();
		server.close();
	}

}
