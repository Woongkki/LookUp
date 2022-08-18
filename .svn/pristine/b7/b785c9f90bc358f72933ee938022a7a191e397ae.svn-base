package kr.or.ddit.schedule.controller;

import java.io.IOException;
import java.io.PrintWriter;
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


@WebServlet("/ScheduleList.do")
public class ScheduleList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		IScheduleService service = ScheduleServiceImpl.getInstance();
	
		List<ScheVO> list = service.allSchedule();
		response.setContentType("application/json; charset=utf-8");
		
		request.setAttribute("list", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("schedule/calendarData.jsp");
		rd.forward(request, response);
		
		
	}

}












