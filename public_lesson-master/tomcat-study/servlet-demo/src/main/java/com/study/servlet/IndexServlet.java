package com.study.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet {

	private static final long serialVersionUID = 5631739327007081912L;

	@Override
	public void init() throws ServletException {
		System.out.println("servlet-demo IndexServlet ��ʼ��");
	}

	@Override
	protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("����servlet���ұ�������");
	}

}