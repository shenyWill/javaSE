package cn.yuanwill.Inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceive {

	public static void main(String[] args) throws IOException {
		// �������ݰ��������
		DatagramSocket ds = new DatagramSocket(6000);
		
		// �����ֽ�����
		byte[] data = new byte[1024*64];
		
		// �������ݰ����󣬴����ֽ�����
		DatagramPacket dp = new DatagramPacket(data, data.length);
		
		ds.receive(dp);
		
		// ��ȡ���Ͷ˵�ip��ַ����
		String ip = dp.getAddress().getHostAddress();
		System.out.println("���Ͷ�ip:" + ip);
		
		// ��ȡ���Ͷ˵Ķ˿ں�
		int port = dp.getPort();
		System.out.println("���Ͷ˵Ķ˿ںţ�" +port);
		
		// ��ȡ���յ����ֽڳ���
		int length = dp.getLength();
		
		System.out.println(new String(data,0,length));
		
		// �ر���Դ
		ds.close();
		
	}

}
