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

@WebServlet("/DeleteMemSchedule.do")
public class DeleteMemSchedule extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String date = request.getParameter("date");
		int id = Integer.parseInt(request.getParameter("id"));
				
		
		ScheVO vo = new ScheVO();
		vo.setSCHEDULE_TITLE(title);
		vo.setSCHEDULE_DATE(date);
		vo.setSCHEDULE_NO(id);
		IScheduleService service = ScheduleServiceImpl.getInstance();
		int res = service.deleteMemSchedule(vo);
		
		request.setAttribute("title", title);
		request.setAttribute("date", date);
		request.setAttribute("id", id);
		request.setAttribute("res", res);
		
		request.getRequestDispatcher("schedule/memCalendar.jsp").forward(request, response);
	}

}
