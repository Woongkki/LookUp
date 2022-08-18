package kr.or.ddit.schedule.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.schedule.service.IScheduleService;
import kr.or.ddit.schedule.service.ScheduleServiceImpl;
import kr.or.ddit.schedule.vo.ScheVO;
@WebServlet("/InsertMemSchedule.do")
public class InsertMemSchedule extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String date = request.getParameter("date");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String memId = request.getParameter("memId");
		if(content.equals(null)) {
			content = "내용없음";
		}
		
		
		ScheVO vo = new ScheVO();
		vo.setSCHEDULE_DATE(date);
		vo.setSCHEDULE_TITLE(title);
		vo.setSCHEDULE_CONTENT(content);
		vo.setMEM_ID(memId);
		IScheduleService service = ScheduleServiceImpl.getInstance();
		String res = service.insertMemSchedule(vo);
		
		request.setAttribute("memId", memId);
		request.setAttribute("title", title);
		request.setAttribute("content", content);
		request.setAttribute("res", res);
		
		
		request.getRequestDispatcher("schedule/memCalendar.jsp").forward(request, response);
	}
	
	}

