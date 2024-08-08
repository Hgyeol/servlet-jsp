package com.edu.test;

import java.io.IOException;

import javax.servlet.*;

public class FlowFilterOne implements Filter{
	
	public void init(FilterConfig config) {
		System.out.println("init() 호출 ......... one");
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter() 호출 전 ......... one");
		chain.doFilter(req, resp);
		System.out.println("doFilter() 호출 후 ......... one");
	}
	
	public void destroy() {
		System.out.println("destroy() 호출 ......... one");
	}
}
