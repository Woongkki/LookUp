package kr.or.ddit.objectBoard.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kr.or.ddit.objectBoard.service.IObjectService;
import kr.or.ddit.objectBoard.service.ObjectServiceImpl;
import kr.or.ddit.objectBoard.vo.ObjectVO;


@WebServlet("/objectBoard.do")
public class objectBoard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public objectBoard() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		IObjectService service = ObjectServiceImpl.getInstance();
		
		List<ObjectVO> listOb = service.selectOb();
		
		Gson gson = new Gson();
		
		String result = gson.toJson(listOb);
		
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.print(result);
		out.flush();
		
		
	}



}
