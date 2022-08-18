package kr.or.ddit.qna.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.qna.service.IQnaService;
import kr.or.ddit.qna.service.QnaServiceImpl;
import kr.or.ddit.qna.vo.QnaVO;


@WebServlet("/qnaInsert.do")
public class QnaInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String mem_id = request.getParameter("mem_id");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String create_date = request.getParameter("create_date");
		
		QnaVO vo = new QnaVO();
		vo.setMem_id(mem_id);
		vo.setTitle(title);
		vo.setContent(content);
		vo.setCreate_date(create_date);
		
		IQnaService service = QnaServiceImpl.getInstance();
		int cnt = service.insertQna(vo);
		response.sendRedirect(request.getContextPath() + "/selectQnaList.do");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
