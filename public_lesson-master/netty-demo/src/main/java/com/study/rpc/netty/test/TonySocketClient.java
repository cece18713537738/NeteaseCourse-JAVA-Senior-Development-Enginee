package com.study.rpc.netty.test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TonySocketClient {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 8080);
		OutputStream outputStream = socket.getOutputStream();

		// ģ��1000�β������ã�����UserService������
		// ÿ������33�ֽ�����,�ܹ�31KB����
		byte[] request = "com.study.rpc.netty.UserService\r\n".getBytes();
		System.out.println(request.length);
		for (int i = 0; i < 1; i++) {
			new Thread(() -> {
				try {
					outputStream.write(request);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}).start();
		}

		System.in.read();
	}
}
