package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class Nana extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//service() 의 매개변수 내 response로 작성
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();

		String cnt_ = request.getParameter("cnt");
		int cnt = 100;//기본값
		if(cnt_ != null && !cnt_.equals("")) 
			cnt = Integer.parseInt(cnt_);
		
		
		for(int i = 0; i < cnt; i++) 
			out.println((i+1)+" : 안녕 Servlet!<br>");
		
		
	}
}
