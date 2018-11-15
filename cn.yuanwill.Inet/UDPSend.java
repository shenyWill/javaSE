package cn.yuanwill.Inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSend {
	/*
	 * 实现UDP协议的发送端：
	 * 实现封装数据的类： java.net.DatagramPacket  将你的数据包装
	 * 实现数据传输的类： java.net.DataparmSocket  将数据包发出去
	 */
	public static void main(String[] args) throws IOException {
		// 发送资源
		byte[] data = "hello UDP".getBytes();
		
		InetAddress inet = InetAddress.getByName("127.0.0.1");
		
		// 包装数据
		DatagramPacket dp = new DatagramPacket(data, data.length, inet, 6000);
		
		// 发送数据包
		DatagramSocket ds = new DatagramSocket();
		ds.send(dp);
		
		// 关闭资源
		ds.close();
	}

}
