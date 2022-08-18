package kr.or.ddit.objectBoard.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.google.gson.Gson;

import kr.or.ddit.objectBoard.service.IObjectService;
import kr.or.ddit.objectBoard.service.ObjectServiceImpl;
import kr.or.ddit.objectBoard.vo.ObjectVO;

/**
 * Servlet implementation class InsertBoard
 */
@WebServlet("/InsertBoard.do")
public class InsertBoard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  request.setCharacterEncoding("utf-8");
	      response.setCharacterEncoding("utf-8");
	      response.setContentType("application/json; charset=utf-8");
	      PrintWriter out = response.getWriter();
	      
	      String id = request.getParameter("memId");
	      String title = request.getParameter("titleInput");
	      String content = request.getParameter("content");
	      
	      IObjectService service = ObjectServiceImpl.getInstance();
	      ObjectVO vo = new ObjectVO();
	      vo.setMem_id(id);
	      vo.setTitle(title);
	      vo.setContent(content);
	      
	      String result =  service.insertOb(vo);
	      
	      Gson gs = new Gson();
	      
	      String res = gs.toJson(result);
	      
	      out.print(res);
	      out.flush();
	}

}
