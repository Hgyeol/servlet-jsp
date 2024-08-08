package com.edu.test;

import java.io.IOException;

import javax.servlet.*;

public class FlowFilterTwo implements Filter{
	String charset;
	public void init(FilterConfig config) {
		System.out.println("init() ȣ�� ......... two");
		charset = config.getInitParameter("en");
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		req.setCharacterEncoding(charset);
		System.out.println("doFilter() ȣ�� �� ......... two");
		chain.doFilter(req, resp);
		System.out.println("doFilter() ȣ�� �� ......... two");
	}
	
	public void destroy() {
		System.out.println("destroy() ȣ�� ......... two");
	}
}
