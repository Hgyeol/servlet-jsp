package com.edu.test;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "timer", urlPatterns = "/third")
public class FlowFilterThree implements Filter{
	
	public void init(FilterConfig config) {}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		long startTime = System.currentTimeMillis();
		chain.doFilter(req, resp);
		long endTime = System.currentTimeMillis();
		long executeTime = endTime - startTime;
		System.out.println("���� �ð� : " + executeTime + "ms");
	}
	
	public void destroy() {}

}
