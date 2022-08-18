package kr.or.ddit.objectBoard.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kr.or.ddit.objectBoard.service.IObjectService;
import kr.or.ddit.objectBoard.service.ObjectServiceImpl;

@WebServlet("/countBoard.do")
public class countBoard extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json; charset=utf-8");
		
		IObjectService service = ObjectServiceImpl.getInstance();
		
		int count = service.totalOb();
		
		Gson gson = new Gson();
		
		String result = gson.toJson(count);
		
		PrintWriter out = response.getWriter();
		
		out.print(result);
		out.flush();
	}

}
