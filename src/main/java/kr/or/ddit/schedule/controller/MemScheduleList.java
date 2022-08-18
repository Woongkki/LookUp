package kr.or.ddit.schedule.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.schedule.service.IScheduleService;
import kr.or.ddit.schedule.service.ScheduleServiceImpl;
import kr.or.ddit.schedule.vo.ScheVO;

@WebServlet("/MemScheduleList.do")
public class MemScheduleList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("utf-8");
		
		String memId = request.getParameter("memId");
		ScheVO vo = new ScheVO();
		vo.setMEM_ID(memId);
		
		IScheduleService service = ScheduleServiceImpl.getInstance();
		List<ScheVO> list = service.allMemSchedule(vo);
		request.setAttribute("list", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("schedule/memCalendarData.jsp");
		rd.forward(request, response);
	}
}


