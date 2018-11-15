package cn.yuanwill.Inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSend {
	/*
	 * ʵ��UDPЭ��ķ��Ͷˣ�
	 * ʵ�ַ�װ���ݵ��ࣺ java.net.DatagramPacket  ��������ݰ�װ
	 * ʵ�����ݴ�����ࣺ java.net.DataparmSocket  �����ݰ�����ȥ
	 */
	public static void main(String[] args) throws IOException {
		// ������Դ
		byte[] data = "hello UDP".getBytes();
		
		InetAddress inet = InetAddress.getByName("127.0.0.1");
		
		// ��װ����
		DatagramPacket dp = new DatagramPacket(data, data.length, inet, 6000);
		
		// �������ݰ�
		DatagramSocket ds = new DatagramSocket();
		ds.send(dp);
		
		// �ر���Դ
		ds.close();
	}

}
