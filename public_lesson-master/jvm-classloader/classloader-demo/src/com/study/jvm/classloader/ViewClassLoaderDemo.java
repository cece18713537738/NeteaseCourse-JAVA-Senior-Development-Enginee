package com.study.jvm.classloader;

import sun.net.spi.nameservice.dns.DNSNameService;

/** �鿴���Ǳ���һ������������ص� */
public class ViewClassLoaderDemo {
	public static void main(String[] args) {
		System.out.println("\r\n1�� �鿴 String�ַ��������࣬��Ӧ�ļ�����");
		System.out.println(String.class.getClassLoader());

		System.out.println("\r\n2�� �鿴DNSNameService������һ��extĿ¼�µ���չ��");
		System.out.println(DNSNameService.class.getClassLoader());

		System.out.println("\r\n3�� �鿴�Լ�д�������ViewClassLoaderDemo����Ӧ�ļ�����");
		System.out.println(ViewClassLoaderDemo.class.getClassLoader());
		System.out.println(ViewClassLoaderDemo.class.getClassLoader().getParent());
		System.out.println(ViewClassLoaderDemo.class.getClassLoader().getParent().getParent());
	}
}
