package com.kh.serverEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

//������ ���� �ȳ��ϼ���, �޼��� �������� ���� �� Ŭ���̾�Ʈ �ڵ��� ����ǰ�
public class Client {
	public static void main(String[] args) {
		int port = 3000;
		String ����Ip;

		try {
			����Ip = InetAddress.getLocalHost().getHostAddress();

			Socket socket = new Socket(����Ip, port);
			System.out.println("������ ����ƽ��ϴ�.");

			// Buffer �Է��� ���� �������� PrintWriter ����ϱ�
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

			out.println("hi serveRRR");

			String m = in.readLine();
			System.out.println("send success : " + m);
			
			out.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
