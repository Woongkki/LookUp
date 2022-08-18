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

@WebServlet("/quesInsertForm.do")
public class QuesInsertForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("여기여기");
		request.setCharacterEncoding("utf-8");
		
		QuestionVO vo = new QuestionVO();
		vo.setManager_id("rsz5");
		
		IQuesService service = QuesServiceImpl.getInstance();
		int cnt = service.seqInsert(vo);
		
		
		HttpSession session = request.getSession();
		if(session.getAttribute("loginMember")==null) {
			request.getRequestDispatcher("question/questionList.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("question/quesInsertForm.jsp").forward(request, response);
		}
		
		//request.getRequestDispatcher("question/quesInsertForm.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
