package com.company;

import java.io.*;

import java.util.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class Login extends HttpServlet {
	   /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Override
	protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
			int count=0;
			String uname = req.getParameter("uname");
			String pass = req.getParameter("pass");
			File fi = new File("D:\\text.txt");
			Scanner sc = new Scanner(fi);
			FileReader fr = new FileReader(fi);
			PrintWriter pw = res.getWriter();
			String data = null;
			 String[] words = null;
			while (sc.hasNextLine()) {
		        data =sc.nextLine();
		        words = data.split(",");
		        for(int i=0;i<words.length-1;i++) {
					if(words[i].equals(uname)){
						count++;
				if(words[i+1].equals(pass)&&words[i].equals(uname)) {
					count++;
				}
				else {
					
				}
			}
			}
			}
			if(count==2) {
				pw.println("Login success");
			}
			else if(count==1) {
				pw.println("worng user name or password");
			}
			else {
			pw.println("user doesn't exists");
			}
			pw.close();
			sc.close();
			fr.close();
		}
	}
