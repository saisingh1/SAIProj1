package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MarriageServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
            PrintWriter pw=null;
            String name=null,age=null,gender=null;
            int age1=0;
              //generel setting
            pw=res.getWriter();
            res.setContentType("text/html");
              //get request parameter values(form data)
            name=req.getParameter("name");
            age=req.getParameter("age");
            age1=Integer.parseInt(age);
            gender=req.getParameter("gender");
            
            //write request proceesing logic
            if(gender.contentEquals("male")) {
            if(age1>=30)
            {
            	pw.println("<h1 style='color:green;text-align:center'> "+name+" you can Get Marriage</h1>");
            }
            else
            {
            	pw.println("<h1 style='color:yellow;text-align:center'> "+name+" you are not Eligible For Marriage</h1>");
            }
            }
            else
            {
            	if(age1>=18)
            	{
            		pw.println("<h1 style='color:red;text-align:center'> "+name+" you can Get Marriage</h1>");
            	}
            }
            //add hyperlink
              pw.println("<a href='input.html'><img src='2.jpg'></a>");
             //close stream
              pw.close();
	}
}
            	
        