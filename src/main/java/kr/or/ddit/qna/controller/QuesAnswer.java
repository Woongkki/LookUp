package kr.or.ddit.qna.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kr.or.ddit.qna.service.IQuesService;
import kr.or.ddit.qna.service.QuesServiceImpl;
import kr.or.ddit.qna.vo.QuestionVO;

@WebServlet("/quesAnswer.do")
public class QuesAnswer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public QuesAnswer() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		System.out.println("서블릿");
		String question_a = request.getParameter("answer");
		int question_no = Integer.parseInt(request.getParameter("question_no"));
		
		IQuesService service = QuesServiceImpl.getInstance();
		QuestionVO vo = new QuestionVO();
		vo.setQuestion_a(question_a);
		vo.setQuestion_no(question_no);
		
		int cnt = service.answerInsert(vo);
		response.sendRedirect(request.getContextPath() + "/question/questionList.jsp");
		//request.getRequestDispatcher("question/questionList.jsp").forward(request, response);
		
//		Gson gson = new Gson();
//		String result = gson.toJson(vo);
//		response.setContentType("application/json; charset=utf-8");
//		PrintWriter out = response.getWriter();
//		
//		out.print(result);
//		out.flush();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
