package kr.or.ddit.member.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.service.IMemberMessegeService;
import kr.or.ddit.member.service.MemberMessegeServiceImpl;
import kr.or.ddit.member.vo.MessegeVO;
import kr.or.ddit.member.vo.QuestionVO;

/**
 * Servlet implementation class MessegeRoomSearch
 */
@WebServlet("/MessegeRoomSearch.do")
public class MessegeRoomSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	            request.setCharacterEncoding("utf-8");
	            IMemberMessegeService sv=MemberMessegeServiceImpl.getInstance();
	            
	            response.setCharacterEncoding("utf-8");
	            PrintWriter out=response.getWriter();
	            List<String>qsnolist=(List<String>)request.getAttribute("qsNoList");
	            List<Integer>msnolist=(List<Integer>)request.getAttribute("msNoList");
	            
	            List<List<QuestionVO>>qslist=new ArrayList<>();
	            List<List<MessegeVO>>mslist=new ArrayList<>();
	           
	            for(String s:qsnolist) {
	            	 qslist.add(sv.qsListSearch(s));
	            }
	            for(int x:msnolist) {
	            	mslist.add(sv.msListSearch(x));
	            }
	            request.setAttribute("ql",qslist);
	            request.setAttribute("ml",mslist);
	            
	                    request.getRequestDispatcher("membermypage/messegeView.jsp").forward(request, response);
	           
	          
	        
	         
	            
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
