<%@page import="kr.or.ddit.member.vo.LikeScheduleVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%List<LikeScheduleVO>likelist=(List<LikeScheduleVO>)request.getAttribute("likelist"); %>

<table border='1'>
<tr>
<td>일정 날짜</td>
<td>제목</td>
</tr>
<% 
for(LikeScheduleVO vo:likelist){
%>
   <tr id='<%=vo.getSchedule_no() %>'>
   <td><%=vo.getSchedule_date() %></td>
   <td><%=vo.getSchedule_title() %></td>
   </tr>
<%
}
%>
</table>
</body>
</html>