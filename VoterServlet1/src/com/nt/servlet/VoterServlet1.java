package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class VoterServlet1 extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
            PrintWriter pw=null;
            String name=null,tage=null;
            int age=0;
              //generel setting
            pw=res.getWriter();
            res.setContentType("text/html");
              //get request parameter values(form data)
            name=req.getParameter("name");
            tage=req.getParameter("age");
            age=Integer.parseInt(tage);
            
            //write request proceesing logic
            if(age>=18)
            {
            	pw.println("<h1 style='color:green;text-align:center'>Mr/Mrs/Miss "+name+" you are eligible for vote</h1>");
            }
            else
            {
            	pw.println("<h1 style='color:red;text-align:center'>Mr/Mrs/Miss "+name+" you are not eligible for vote</h1>");
            }
            //add hyperlink
              pw.println("<a href='input.html'><img src='3.png'></a>");
             //close stream
              pw.close();
	}
}
            	
        