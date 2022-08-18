package kr.or.ddit.notice.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.notice.service.INoticeService;
import kr.or.ddit.notice.service.NoticeServiceImpl;
import kr.or.ddit.notice.vo.NoticeVO;

@WebServlet("/noticeUpdateForm.do")
public class NoticeUpdateForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int notice_no = Integer.parseInt(request.getParameter("notice_no"));
		
		INoticeService service = NoticeServiceImpl.getInstance();
		NoticeVO noticeVo = service.noticeDetail(notice_no);
		request.setAttribute("noticeVo", noticeVo);
		
		
		HttpSession session = request.getSession();
		if(session.getAttribute("loginMember")==null) {
			request.getRequestDispatcher("/selectNoticeList.do").forward(request, response);
		}else {
			request.getRequestDispatcher("notice/noticeUpdateForm.jsp").forward(request, response);
		}
		
		//request.getRequestDispatcher("notice/noticeUpdateForm.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
