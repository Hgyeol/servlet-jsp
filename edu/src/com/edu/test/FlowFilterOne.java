package com.edu.test;

import java.io.IOException;

import javax.servlet.*;

public class FlowFilterOne implements Filter{
	
	public void init(FilterConfig config) {
		System.out.println("init() ȣ�� ......... one");
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter() ȣ�� �� ......... one");
		chain.doFilter(req, resp);
		System.out.println("doFilter() ȣ�� �� ......... one");
	}
	
	public void destroy() {
		System.out.println("destroy() ȣ�� ......... one");
	}
}
