package com.sds.icto.sevlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/life")
public class LifeCircleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LifeCircleServlet() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("call init()");
		super.init();
	}

	public void destroy() {
		System.out.println("call destroy()");
		super.destroy();
	}
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("call service()");
		super.service(request, response);
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("call doGet()");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("call doPost()");
	}

}
