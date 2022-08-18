<%@page import="kr.or.ddit.schedule.vo.ScheVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<ScheVO> list = (List<ScheVO>)request.getAttribute("list");
%>

	[
<%
	for(int i =0; i<list.size(); i++){
		ScheVO vo = list.get(i);	
		if(i > 0) out.print(",");
		%>
			{
				"id"    : "<%= String.valueOf(vo.getSCHEDULE_NO())%>",						
				"title" : "<%= vo.getSCHEDULE_TITLE() %>",						
				"description" : "<%= vo.getSCHEDULE_CONTENT() %>",
				"start" : "<%= vo.getSCHEDULE_DATE() %>"
			}
		<%	
		}
		%>
	]
