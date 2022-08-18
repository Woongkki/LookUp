package kr.or.ddit.member.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.member.service.ILikeService;
import kr.or.ddit.member.service.LikeServiceImpl;
import kr.or.ddit.member.vo.LikeScheduleVO;
import kr.or.ddit.member.vo.MemberVO;

/**
 * Servlet implementation class LikeSchedule
 */
@WebServlet("/LikeSchedule.do")
public class LikeSchedule extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session=request.getSession();
		 MemberVO vo=(MemberVO)session.getAttribute("loginMember");
		 String id=vo.getMem_id();
		 ILikeService sv=LikeServiceImpl.getInstance();
		 List<LikeScheduleVO>likeList=sv.likeList(id);
		 request.setAttribute("likelist", likeList);
		 request.getRequestDispatcher("membermypage/LikeScheduleView.jsp").forward(request, response);
		 
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
