package com.raystech.studentassignment;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import sun.misc.BASE64Encoder;

@WebServlet("/studentctl")
public class studentctl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Studentbean bean= new Studentbean();
		bean.setId(Integer.parseInt(request.getParameter("id")));
		bean.setRoll_no(request.getParameter("rollno"));
		bean.setFirst_name(request.getParameter("firstname"));
		bean.setLast_name(request.getParameter("lastname"));
		bean.setSession(request.getParameter("session"));
		String op= request.getParameter("operation");
		Studentmodel model= new Studentmodel();
		if(op.equals("add")) {
		try {
			model.add(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

}
