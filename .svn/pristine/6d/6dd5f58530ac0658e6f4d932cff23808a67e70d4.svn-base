package kr.or.ddit.member.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;

/**
 * Servlet implementation class MemberIdCheck
 */
@WebServlet("/MemberIdCheck.do")
public class MemberIdCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("mem_id");
		
		IMemberService service=MemberServiceImpl.getInstance();
		Gson gson=new Gson();
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json; charset=utf-8");
		String result;
		PrintWriter out=response.getWriter();
		
	       if(service.memberIdCheck(id)==0) {
	    	  result="ok";
	       }else {
	    	   result="no";
	       }
	          String r=gson.toJson(result);
	          out.println(r);
	          out.flush();

		
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
