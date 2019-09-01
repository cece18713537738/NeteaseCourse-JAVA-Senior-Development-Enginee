package com.study.rpc.netty.test;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TonySocketServer {
	public static void main(String[] args) throws IOException, Exception {
		// server
		ServerSocket serverSocket = new ServerSocket(8080);

		// ��ȡ������
		final Socket accept = serverSocket.accept();
		InputStream inputStream = accept.getInputStream();
		while (true) {
			byte[] request = new byte[1024];
			inputStream.read(request);

			// �õ��������ݣ�������þ������
			String className = new String(request);
			System.out.println(className);
		}
	}
}
