package com.kh.serverEx;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
/*
 ���� IP�� 192.200.3.58 �� �� ������ �����ϴ� ����� �����ؼ� �ۼ��ϱ�
 * */

public class IPPort {
	public static void main(String[] args) {
		try {
			
			
			
			String serveIP = InetAddress.getLocalHost().getHostAddress();
			
			System.out.println(serveIP);
									//serveIP = 192.168.0.35 ���� ��ǻ�� IP �ּ�
			Socket socket = new Socket(serveIP, 3000);
			System.out.println(socket);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
