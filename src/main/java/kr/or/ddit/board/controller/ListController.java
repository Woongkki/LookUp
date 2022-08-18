package kr.or.ddit.board.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import kr.or.ddit.board.service.FreeBoardServiceImpl;
import kr.or.ddit.board.service.IFreeBoardService;
import kr.or.ddit.board.vo.FreeboardListVO;



/**
 * Servlet implementation class List
 */
@WebServlet("/List.do")
public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                      request.setCharacterEncoding("utf-8");
                      //요청시 데이터받기-페이지번호,stype,sword
                      int rqpage=Integer.parseInt(request.getParameter("page"));
                      String rqtype=request.getParameter("stype");
                      String rqsord=request.getParameter("sword");
//                       System.out.println(rqtype);
//                       System.out.println(rqsord);
//                       System.out.println(rqpage);
                      //service객체생성
                      IFreeBoardService service=FreeBoardServiceImpl.getInstance();
                        
                      
                      Map<String,Object>pmap=service.getPageInfo(rqpage,rqtype,rqsord);
                      //pmap:statr,end,startpage,endpage,totalPage
                      
                      //page관련 작업      
                      Map<String,Object>map=new HashMap<>();
                      
                      
                      
                      int startval=(int)pmap.get("start");
                      int endval=(int)pmap.get("end");
                      map.put("start", startval);
                      map.put("end", endval);
                      map.put("stype",rqtype);
                      map.put("sword",rqsord);
                      //service메소드 호출 하기-결과값 얻기
                  List<FreeboardListVO>list=service.selectList(map);
                      int cnt=list.size();
                      JsonObject obj=new JsonObject();
                      obj.addProperty("totalp",(int)pmap.get("totalPage"));
                      obj.addProperty("startp",(int)pmap.get("startpage"));
                      obj.addProperty("endp",(int)pmap.get("endpage"));
                      obj.addProperty("total",cnt);
                      
                      
                      
                      //결과값으로 응답데이타 생성-json데이터로 변환
                      Gson gson=new Gson();
               //     String result=gson.toJson(list);
           
                    JsonElement result=gson.toJsonTree(list); 
                    obj.add("datas", result); 
                      response.setCharacterEncoding("utf-8");
                      response.setContentType("apllicatin/json; charset=utf-8");
                      PrintWriter out=response.getWriter();
                      out.println(obj);
                      out.flush();
	}

}
