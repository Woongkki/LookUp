package kr.or.ddit.qna.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.qna.service.IQuesService;
import kr.or.ddit.qna.service.QuesServiceImpl;
import kr.or.ddit.qna.vo.QuestionVO;

@WebServlet("/qnaInsertForm.do")
public class QnaInsertForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("loginMember")==null) {
			request.getRequestDispatcher("/selectQnaList.do").forward(request, response);
		}else {
			request.getRequestDispatcher("qna/qnaInsertForm.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
