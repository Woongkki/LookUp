package kr.or.ddit.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.board.service.FreeBoardServiceImpl;
import kr.or.ddit.board.service.IFreeBoardService;
import kr.or.ddit.board.vo.FreeComment2VO;
import kr.or.ddit.board.vo.FreeCommentVO;
import kr.or.ddit.board.vo.FreeboardDetailVO;

/**
 * Servlet implementation class FreeBoardDetail
 */
@WebServlet("/FreeBoardDetail.do")
public class FreeBoardDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");
//		String id=request.getParameter("id");
//		IFreeBoardService sv=FreeBoardServiceImpl.getInstance();
//		FreeboardDetailVO fvo=sv.fdetail(id);
//		System.out.println(fvo);
//		System.out.println("여기까지는 성공적");
//		int count=sv.fbcount(id);
//		List<FreeCommentVO>fclist=sv.fcvlist(id);
//		
//		request.setAttribute("fc",count);
//		request.setAttribute("fvo", fvo);
//		request.setAttribute("fcl", fclist);
//		request.getRequestDispatcher("board/freeboardDetail.jsp").forward(request, response);
		
		
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		IFreeBoardService sv=FreeBoardServiceImpl.getInstance();
		FreeboardDetailVO fvo=sv.fdetail(id);
//		System.out.println(fvo);
//		System.out.println("여기까지는 성공적");
		int count=sv.fbcount(id);
		List<FreeCommentVO>fclist=sv.fcvlist(id);
		
	    int cnt=0;
	   for(FreeCommentVO vo:fclist) {
		   List<FreeComment2VO>fc2list=sv.fc2list(vo.getComment_no());
		   request.setAttribute(vo.getComment_no()+"",fc2list);
	   }
	    // cnt=sv.fec2cnt(comment_no);
		
		
		
		request.setAttribute("fc",count);
		request.setAttribute("fvo", fvo);
		request.setAttribute("fcl", fclist);
		request.getRequestDispatcher("/board/freeboardDetail.jsp").forward(request, response);
		
		
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
