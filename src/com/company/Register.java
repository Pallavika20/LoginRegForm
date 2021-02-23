package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class Register extends HttpServlet {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
	FileWriter fw = new FileWriter("D:\\text.txt",true);
	PrintWriter pw = res.getWriter();
	String fname = req.getParameter("fname");
	String lname = req.getParameter("lname");
	String uname = req.getParameter("uname");
	String pass = req.getParameter("pass");
	fw.append("\n\n");
	fw.write(fname+","+lname+","+uname+","+pass);
	fw.close();
    pw.println("Registration Success");
   }
}