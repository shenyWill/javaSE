package cn.yuanwill.Inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		function_1();
	}
	
	// ���Լ��ҵ�ip
	public static void function() throws UnknownHostException{
		InetAddress inet = InetAddress.getLocalHost();
		String ip = inet.getHostAddress();
		String name = inet.getHostName();
		System.out.println(ip + "..." + name);
	}
	
	// �ñ��˵�ip
	public static void function_1() throws UnknownHostException{
		InetAddress inet = InetAddress.getByName("0194-PA1");
		System.out.println(inet);
	}
}
