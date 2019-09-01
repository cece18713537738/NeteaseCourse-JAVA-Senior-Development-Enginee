package com.study.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "consumer.xml" });
		context.start();
		// ��ȡdubboע���Զ�̵��ô������
		DemoService demoService = (DemoService) context.getBean("demoService");
		// ִ��Զ�̵���
		String result = demoService.test("123");
		// չʾ���ý��
		System.out.println("���ý��####>>>>>" + result);

	}
}