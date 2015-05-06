package com.sds.icto.sevlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TableServlet
 */
@WebServlet("/table")
public class TableServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public TableServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int nRow = 0;
		int nCol = 0;
		
		if(request.getParameter("r")!=null){
			nRow = Integer.parseInt(request.getParameter("r"));
		}else{
			nRow = 3;
		}
		if(request.getParameter("c")!=null){
			nCol = Integer.parseInt(request.getParameter("c"));
		}else{
			nCol = 3;
		}
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<table border='1px' cellpadding='10px' cellspacing='0' >");
		for (int i = 0; i < nRow; i++) {
			out.println("<tr>");
			for (int j = 0; j < nCol; j++) {
				out.println("<td>셀("+i+","+j+")</td>");
			}
			out.println("</tr>");
		}
		out.println("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
