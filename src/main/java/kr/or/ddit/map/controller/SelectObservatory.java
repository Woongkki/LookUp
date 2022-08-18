package kr.or.ddit.map.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kr.or.ddit.map.service.IObservatoryService;
import kr.or.ddit.map.service.ObservatoryServiceImpl;
import kr.or.ddit.map.vo.ObservatoryVO;


@WebServlet("/SelectObservatory.do")
public class SelectObservatory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SelectObservatory() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		
		IObservatoryService service = ObservatoryServiceImpl.getInstance();
		ObservatoryVO vo = service.selectObservatory(name);
		
		Gson gson = new Gson();
		String result = gson.toJson(vo);
		
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(result);
		out.flush();
	
	}

}
