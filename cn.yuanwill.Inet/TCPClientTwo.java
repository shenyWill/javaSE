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
		
		// 获取图片 写入服务器
		OutputStream out = socket.getOutputStream();
		
		// 创建输入流，读取本地图片
		FileInputStream fis = new FileInputStream("C:\\Users\\shenyuan\\Desktop\\ss.jpg");
		int len = 0;
		byte[] bytes = new byte[1024];
		while((len = fis.read(bytes)) != -1) {
			out.write(bytes,0,len);
		}
		
		socket.shutdownOutput();
		
		// 获取字节输入流，读取服务器的上传成功
		InputStream in = socket.getInputStream();
		len = in.read(bytes);
		System.out.println(new String(bytes,0,len));
		
		fis.close();
		socket.close();
	}

}
