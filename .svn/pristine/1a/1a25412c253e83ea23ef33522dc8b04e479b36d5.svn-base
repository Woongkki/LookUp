package kr.or.ddit.board.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.board.service.FreeBoardServiceImpl;
import kr.or.ddit.board.service.IFreeBoardService;

/**
 * Servlet implementation class FreeComment2insert
 */
@WebServlet("/FreeComment2insert.do")
public class FreeComment2insert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	System.out.println("서블릿 통과");
		request.setCharacterEncoding("utf-8");
		IFreeBoardService sv=FreeBoardServiceImpl.getInstance();
		String mem_id=request.getParameter("mem_id");
		String free_no=request.getParameter("id");
		String comment_no=request.getParameter("comment_no");
		String content=request.getParameter("content");
		Map<String,String>para=new HashMap<>();
		para.put("mem_id",mem_id);
		para.put("free_no",String.valueOf(free_no));
		para.put("comment_no",String.valueOf(comment_no));
		para.put("content", content);
		
		
		sv.fc2in(para);
		request.getRequestDispatcher("/FreeBoardDetail.do").forward(request, response);  
		
	}

}
