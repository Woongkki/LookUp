package kr.or.ddit.board.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.board.service.FreeBoardServiceImpl;
import kr.or.ddit.board.service.IFreeBoardService;
import kr.or.ddit.member.vo.MemberVO;


/**
 * Servlet implementation class FreeBoardWhrite
 */
@WebServlet("/FreeBoardWhrite.do")
public class FreeBoardWhrite extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  request.setCharacterEncoding("utf-8");
		  HttpSession session=request.getSession();
		  MemberVO vo=(MemberVO)session.getAttribute("loginMember");
	  String id=vo.getMem_id();
	//	  String id="dsd";
		  String title=request.getParameter("title");
		  String content=request.getParameter("content");
		  Map<String,String>para=new HashMap<String,String>();
		  para.put("content", content);
		  para.put("title",title);
		  para.put("mem_id",id);
		  IFreeBoardService sv=FreeBoardServiceImpl.getInstance();
		   
		  int cnt=0;
		   cnt=sv.freecr(para);
		   response.sendRedirect(request.getContextPath()+"/board/board2.jsp");
	}

}
