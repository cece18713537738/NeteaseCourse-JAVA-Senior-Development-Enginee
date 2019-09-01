package com.study.jvm.classloader;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class ClassLoaderDemo {
	public static void main(String[] args) throws Exception {
		// �Լ�����һ��classLoaderʵ�� ,ȥ���� class�Ĳ�ͬ�汾��ʾ���е�class������jar�����棩
		// 1�� ����Ҫָ�� class��λ��
		URL jarUrl = new URL("file:\\d:\\dabaojian.jar");
		URLClassLoader parentLoader = new URLClassLoader(new URL[] { jarUrl });
		
		// ÿ��3�����һ���࣬���ز�ͬ�İ汾��
		while (true) {
			// TODO ����ļ��Ƿ��ֱ仯
			// 2�� �����������ʵ��
			URLClassLoader classLoader = new URLClassLoader(new URL[] { jarUrl }, parentLoader);
			// 3�� ������ service
			Class<?> dabaojian = classLoader.loadClass("com.study.jvm.classloader.service.DabaojianService");
			// 4�� ʹ��
			Object newInstance = dabaojian.newInstance();
			dabaojian.getMethod("taishi").invoke(newInstance);

			newInstance = null;
			classLoader = null;
			System.gc();
			
			Thread.sleep(3000L);
		}
	}
}
