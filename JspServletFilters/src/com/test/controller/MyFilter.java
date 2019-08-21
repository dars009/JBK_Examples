package com.test.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

public class MyFilter implements Filter {

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("Init Method Filter Interface");
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("In filter My filter");
		PrintWriter out = resp.getWriter();

		String password = req.getParameter("password");
		if (password.equals("admin")) {
			chain.doFilter(req, resp);// sends request to next resource
		} else {
			out.print("username or password error!");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);
		}

	}

	public void destroy() {
		System.out.println("Destroy Method of filter class called");
	}

}