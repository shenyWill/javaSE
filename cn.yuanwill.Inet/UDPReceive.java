package cn.yuanwill.Inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceive {

	public static void main(String[] args) throws IOException {
		// 创建数据包传输对象
		DatagramSocket ds = new DatagramSocket(6000);
		
		// 创建字节数组
		byte[] data = new byte[1024*64];
		
		// 创建数据包对象，传递字节数组
		DatagramPacket dp = new DatagramPacket(data, data.length);
		
		ds.receive(dp);
		
		// 获取发送端的ip地址对象
		String ip = dp.getAddress().getHostAddress();
		System.out.println("发送端ip:" + ip);
		
		// 获取发送端的端口号
		int port = dp.getPort();
		System.out.println("发送端的端口号：" +port);
		
		// 获取接收到的字节长度
		int length = dp.getLength();
		
		System.out.println(new String(data,0,length));
		
		// 关闭资源
		ds.close();
		
	}

}
