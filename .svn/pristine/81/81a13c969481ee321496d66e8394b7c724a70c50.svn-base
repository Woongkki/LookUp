package kr.or.ddit.notice.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.notice.service.INoticeService;
import kr.or.ddit.notice.service.NoticeServiceImpl;
import kr.or.ddit.notice.vo.NoticeVO;

@WebServlet("/noticeUpdate.do")
public class NoticeUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		int notice_no = Integer.parseInt(request.getParameter("notice_no"));
		String mem_id = request.getParameter("mem_id");
		String no_title = request.getParameter("no_title");
		String no_content = request.getParameter("no_content");
		String create_date = request.getParameter("create_date");
		
		NoticeVO vo = new NoticeVO();
		vo.setNotice_no(notice_no);
		vo.setMem_id(mem_id);
		vo.setNo_title(no_title);
		vo.setNo_content(no_content);
		vo.setCreate_date(create_date);
		
		INoticeService service = NoticeServiceImpl.getInstance();
		int cnt = service.updateNotice(vo);
		response.sendRedirect(request.getContextPath() + "/selectNoticeList.do"); //noticeDetail.do
	}

}
