//ExcelServlet.java
package com.nt.Servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ExcelServlet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		PrintWriter pw=null;
		//get PrintWriter object
		pw=res.getWriter();
		//set Response content type
		res.setContentType("application/vnd.ms-excel");
		//write logic to generate output(webpage)
		pw.println("<table border='1' bgcolor='cyan'>");
		pw.println("<tr><td>Name</th><th>Surname<th></tr>");
		pw.println("<tr><td>Asaram</th><th>Rathod<th></tr>");
		pw.println("<tr><td>Godawari</th><th>Rathod<th></tr>");
		pw.println("<tr><td>Ashwini</th><th>Rathod<th></tr>");
		pw.println("<tr><td>Arati</th><th>Rathod<th></tr>");
		pw.println("<tr><td>Amol</th><th>Rathod<th></tr>");
		pw.println("</table>");

		//close Stream
		pw.close();
	}//service(-,-)
}//class
