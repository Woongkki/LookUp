package kr.or.ddit.qna.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.qna.service.IQnaService;
import kr.or.ddit.qna.service.QnaServiceImpl;


@WebServlet("/qnaDelete.do")
public class QnaDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int qna_no = Integer.parseInt(request.getParameter("qna_no"));
		System.out.println("서블릿 : " + qna_no);
		IQnaService service = QnaServiceImpl.getInstance();
		int cnt = service.deleteQna(qna_no);
		System.out.println("cnt : " + cnt);
		
		
		HttpSession session = request.getSession();
		if(session.getAttribute("loginMember")==null) {
			request.getRequestDispatcher("/selectQnaList.do").forward(request, response);
		}else {
			response.sendRedirect(request.getContextPath() + "/selectQnaList.do");
		}
		
		//response.sendRedirect(request.getContextPath() + "/selectQnaList.do");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
