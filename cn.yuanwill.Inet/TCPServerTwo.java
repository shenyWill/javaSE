package cn.yuanwill.Inet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerTwo {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8000);
		Socket socket = server.accept();
		
		// ͨ���ͻ������Ӷ��󣬻�ȡ�ֽ�����������ȡ�ͻ���ͼƬ
		InputStream in = socket.getInputStream();
		
		File upload = new File("f:\\upload");
		if (!upload.exists()) {
			upload.mkdirs();
		}
		FileOutputStream fos = new FileOutputStream(upload+"\\t.jpg");
		byte[] bytes = new byte[1024];
		int len = 0;
		while((len=in.read(bytes)) != -1) {
			fos.write(bytes,0,len);
		}
		
		socket.getOutputStream().write("�ϴ��ɹ�".getBytes());
		fos.close();
		socket.close();
		server.close();
	}

}
