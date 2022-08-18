package kr.or.ddit.member.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import kr.or.ddit.member.service.BlockMemberServiceImpl;
import kr.or.ddit.member.service.IBlockMemberService;
import kr.or.ddit.member.vo.MemberVO;

/**
 * Servlet implementation class BlockCancele
 */
@WebServlet("/BlockCancele.do")
public class BlockCancele extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("utf-8");
		 String caneleId=request.getParameter("id");
		 HttpSession session=request.getSession();
		 MemberVO vo=(MemberVO)session.getAttribute("loginMember");
		 String id=vo.getMem_id();
		 Map<String,String>para=new HashMap<String,String>();
		 para.put("mem_id",id);
		 para.put("cnid",caneleId);
		 IBlockMemberService sv=BlockMemberServiceImpl.getInstance();
		 int cnt=sv.blockCancele(para);
		 String result="";
		 if(cnt==0) {
			 result="false";
		 }
		 else {
			 result="true";
		 }
		 Gson gson=new Gson();
		  String r=gson.toJson(result);
		  response.setCharacterEncoding("utf-8");
		  response.setContentType("application/json; charset=utf-8");
		  PrintWriter out=response.getWriter();
		  out.println(r);
		  out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
