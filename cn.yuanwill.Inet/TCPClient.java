package cn.yuanwill.Inet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// 创建socket对象，连接服务器
		Socket socket = new Socket("127.0.0.1", 8888);
		OutputStream out = socket.getOutputStream();
		out.write("server is OK".getBytes());
		
		// 读取服务器发回来的数据
		InputStream in = socket.getInputStream();
		byte[] data = new byte[1024];
		int len = in.read(data);
		System.out.println(new String(data,0,len));
		
		socket.close();
	}

}
