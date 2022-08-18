package kr.or.ddit.qna.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.qna.service.IQuesService;
import kr.or.ddit.qna.service.QuesServiceImpl;
import kr.or.ddit.qna.vo.QuestionVO;

@WebServlet("/quesInsert.do")
public class QuesInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("서블릿");
		
		request.setCharacterEncoding("utf-8");
		
		String mem_id = request.getParameter("mem_id");
		String question_q = request.getParameter("question_q");
		String question_date = request.getParameter("question_date");
		String res = request.getParameter("noticeBoard");
		
		int datail_no = 0;
		if(res.equals("관측회")) {
			datail_no = 2;
		}else if(res.equals("회원가입")) {
			datail_no = 1;
		}else if(res.equals("관심일정")) {
			datail_no = 4;
		}else if(res.equals("차단사용자")) {
			datail_no = 3;
		}
		
		QuestionVO vo = new QuestionVO();
		vo.setMem_id(mem_id);
		vo.setQuestion_q(question_q);
		vo.setQuestion_date(question_date);
		vo.setDetail_no(datail_no);
		
		IQuesService service = QuesServiceImpl.getInstance();
		int cnt = service.quesInsert(vo);
		
		response.sendRedirect(request.getContextPath() + "/question/questionList.jsp");
	}

}
