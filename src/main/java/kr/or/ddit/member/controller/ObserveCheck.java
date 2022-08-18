package kr.or.ddit.member.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.member.service.IObserveService;
import kr.or.ddit.member.service.ObserveServiceImpl;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.member.vo.ObserveVO;

/**
 * Servlet implementation class ObserveCheck
 */
@WebServlet("/ObserveCheck.do")
public class ObserveCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session=request.getSession();
		MemberVO vo=(MemberVO)session.getAttribute("loginMember");
		String id=vo.getMem_id();
	
		IObserveService sv=ObserveServiceImpl.getInstance();
		List<ObserveVO> oblist=sv.oblist(id);
		System.out.println(oblist);
		request.setAttribute("oblist", oblist);
		request.getRequestDispatcher("membermypage/observeapplycheck.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
