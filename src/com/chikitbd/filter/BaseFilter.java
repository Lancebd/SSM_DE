package com.chikitbd.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public abstract class BaseFilter implements Filter {

	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected HttpSession session;
	protected FilterChain chain;
	protected FilterConfig config;
	
	public void destroy() {
		mydestroy();
	}

	public abstract void mydestroy();
	
	public void doFilter(ServletRequest req, ServletResponse rep, FilterChain chain)
			throws IOException, ServletException {
		request = (HttpServletRequest) req;
		response = (HttpServletResponse) rep;
		session = request.getSession();
		this.chain = chain;
		doFilter();
	}
	
	public abstract void doFilter()throws IOException, ServletException;
	
	public void init(FilterConfig config) throws ServletException {
		this.config=config;
		init();
	}
	
	public abstract void init();

}
