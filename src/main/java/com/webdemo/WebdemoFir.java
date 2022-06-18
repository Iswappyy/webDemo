package com.webdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class WebdemoFir implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
			int num1 =Integer.parseInt(req.getParameter("num1"));
			int num2 =Integer.parseInt(req.getParameter("num2"));
			
			int k = num1 + num2;
			
			PrintWriter out = res.getWriter();
			
			out.println("Result is: "+k);
			
		    System.out.println("Result is: "+k);
			
		
	}
	

}
