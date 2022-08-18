package kr.or.ddit.member.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.member.service.BlockMemberServiceImpl;
import kr.or.ddit.member.service.IBlockMemberService;
import kr.or.ddit.member.vo.MemberVO;

/**
 * Servlet implementation class BlockMember
 */
@WebServlet("/BlockMember.do")
public class BlockMember extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	            HttpSession session=request.getSession();
	           MemberVO vo=(MemberVO)session.getAttribute("loginMember");
	           String id=vo.getMem_id();
	           IBlockMemberService sv=BlockMemberServiceImpl.getInstance();
	           List<String>blackList=sv.blacklist(id);
	           request.setAttribute("blacklist", blackList);
	           request.getRequestDispatcher("membermypage/blacklistview.jsp").forward(request, response);
	            
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
