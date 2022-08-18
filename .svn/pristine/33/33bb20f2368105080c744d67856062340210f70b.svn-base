<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>LOOK UP</title>
  <meta charset="utf-8">
  
<script src="<%=request.getContextPath()%>/js/jquery-3.6.0.min.js"></script>


<link rel="stylesheet" href="<%=request.getContextPath()%>/css/board.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/typing.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/btn.css">

<style>
.mainContent{
	position: fixed;
	overflow: auto;
}
.subTitle{
	margin-left: 50px;
	margin-top: 10px;
	padding: 5px;	
}
.middleBox{
	display: flex;
	margin: 20px 50px 1px 50px;
	justify-content: space-between;
	width: 91%;		 
	height: 40px;
}
.midsearch{
	padding-top: 3px;
	margin-right: 40px;
	margin-top: 20px;	
}
.midSpan{
	margin-left: 40px;
	font-size: 1.2em;
}
.midHr{ 
	margin-right: 120px;
} 

#footer{
    position: fixed;
    bottom: 0;
    clear: both;
    width: 100%;
    height: 80px;
    color : black;
    background-color: white;
}

#insertbutton{
	margin-right: 120px;
	margin-top : 10px;
	overflow: hidden;
	height: auto;
}
#insertbutton input{
	width: 80px;
	height: 40px;
	float: right;
	margin-right: 20px;
	cursor:pointer;
}
button, textarea {
    font-family: "Apple SD Gothic Neo", "맑은 고딕", "Malgun Gothic", 돋움, dotum, sans-serif;
}

/* 표 클릭 호버*/
.tablecilck:hover{
	background-color: #dedede;
	text-decoration: none;
	font-weight: bold;
	cursor:pointer;
}
table.type04 {
  border-collapse: separate;
  border-spacing: 1px;
  text-align: left;
  line-height: 1.5;
  border-top: 1px solid #ccc;
  margin : 20px 10px;
  margin-left: 60px;  
  width: 89%;
  text-align: center;
}
table.type04 th {
  padding: 10px;
  font-weight: bold;
  vertical-align: top;
  border-bottom: 1px solid #ccc; 
}
table.type04 td {
  padding: 10px;
  vertical-align: top;
  border-bottom: 1px solid #ccc;
}
table.tableNum1{
	width: 3%;
}
table.tableNum2{
	width: 50%;
}
table.tableNum3{
	width: 15%;
}
table.tableNum4{
	width: 15%;
}
table.tableNum5{
	width: 15%;
}
</style>

<script type="text/javascript">
	$(function(){
		id=$('#memId').val();
		status=$('#status').val();
		
		$.ajax({
			url : "<%=request.getContextPath()%>/selectQuesList.do",
			type : "get",
			data:{"id" : id,"status":status},
			success : function(res){
				no=0;
				str = '<table class="type04">';
				str += '<tr>';
				str += '<th class="tableNum1">대화방번호</th>';
				str += '<th class="tableNum2">문의카테고리</th>';
				str += '<th class="tableNum3">작성자</th>';
				str += '<th class="tableNum4">등록일</th>';
				str += '</tr>';
				$.each(res,function(i,v){
					if(no!=v.question_room_no){
					str += '<tr class="tablecilck" onclick="location.href=\'question.jsp?roomNo=' + v.question_room_no + '\'">';
					str += '<td>' + v.question_room_no + '</td>';
					str += '<td>' + v.detail_name + '</td>';
					str += '<td>' + v.mem_id + '</td>';
					str += '<td>' + v.question_date + '</td>';
					str += '</tr>';
					}
					no= v.question_room_no;
				})
				str += '</table>';
				$(".container").html(str);
			},
			error : function(xhr){
				alert("상태 : " + xhr.status);
			},
			dataType : "json"
		})
		
		$("#btnAdd").on("click",function(){
			location.href="<%=request.getContextPath()%>/quesInsertForm.do";
		})
	})
</script>

</head>
<body>
<%
	MemberVO vo=(MemberVO)session.getAttribute("loginMember");
%>
<%if(vo!=null){
%>
<input type='hidden' value='<%=vo.getMem_id() %>' id='memId'>	
<input type='hidden' value='<%=vo.getStatus() %>' id='status'>	
<%	
}
%>
<!-- 상단메뉴 -->
	<header>
	<nav>
		<div id="topMenu" class="FF">
			<div class="title">
				<a href="../main/main.jsp">
					<img class="titleImg" alt="메인배너R.png" src="../images/메인배너R.png">
				</a>
			</div>

			<%if(session.getAttribute("loginMember")==null){ 
			%>
				<div class="dropdown FF topText">
				<a href="../memberjoin/memberForm.jsp" class="login">JOIN</a>	
			</div>
			<div class="dropdown FF topText">
				<a href="../login/login.jsp" class="login">LOGIN</a>
			</div>
			<%
			}else{
			%>
				<div class="dropdown FF topText">
				<a href="<%=request.getContextPath()%>/Logout.do" class="join">LOGOUT</a>		
			</div>
			<div class="dropdown FF topText">
				<a href="../membermypage/mypageMenu.jsp" class="login">마이페이지</a>
			</div>
			
			<% 
			}
			%>

			<div class="dropdown FF">
				<button id="notice" class="dropbtn FF ahover">
					<span class="dropbtn_icon"></span> 공지
				</button>
				<div class="dropdown-content">
					<a href="<%=request.getContextPath() %>/selectNoticeList.do">공지사항</a> 
					<a href="<%=request.getContextPath() %>/selectQnaList.do">자주 묻는 질문</a> 
					<a href="<%=request.getContextPath() %>/question/questionList.jsp">1:1문의</a>
				</div>
			</div>

			<div class="dropdown FF">
				<button class="dropbtn FF ahover">
					<span class="dropbtn_icon"></span> 게시판
				</button>
				<div class="dropdown-content">
					<a href="<%=request.getContextPath()%>/schedule/Schedule.jsp">소식/일정 게시판</a> 
					<a href="<%=request.getContextPath()%>/LOOKUP/board(갤러리게시판).jsp">관측 게시판</a> 
					<a href="<%=request.getContextPath()%>/board/board2.jsp">자유 게시판</a> 
					<a href="<%=request.getContextPath()%>/observersServletGet.do?check=10">관측회게시판</a>
					<a href="<%=request.getContextPath()%>/map/Map.jsp">천문대 검색</a> 
				</div>
			</div>

		</div>
	</nav>
	</header>

<aside>

		<ul style="border-radius: 0px 0px 40px 0px; background: black;" class="FR">
			<li><a
				href='<%=request.getContextPath()%>/membermypage/memberdetail.jsp'>회원정보수정</a></li>
			<li><a href='<%=request.getContextPath()%>/mycontentcheck/mycontentview.jsp'>내 글 보기</a></li>
			<!-- 문의관리서블릿 따로 만들어야함 -->
			<li><a
				href='<%=request.getContextPath()%>/question/questionList.jsp'>문의관리</a></li>
			<li><a href='<%=request.getContextPath()%>/BlockMember.do'>차단사용자
					관리</a></li>
			<li><a href='<%=request.getContextPath()%>/ObserveCheck.do'>관측회
					신청 현황</a></li>
			<li><a href='<%= request.getContextPath()%>/schedule/memSchedule.jsp'>관심
					일정 관리</a></li>
		</ul>


	</aside>


<!-- ------------------------------------------------------------------------------------------- -->

<section>

<div class="mainContent">
	<div class="subTitle">
	 	<h2> 내문의내역 </h2> <!-- 소 제목 -->
	</div>
	
	<div class="container"></div>
	
	<div id="insertbutton">
		<input id="btnAdd" type="button" value="문의하기">
	</div>

</div>
</section>

<!-- ------------------------------------------------------------------------------------------- -->
	
	<footer id="footer">
 	  <div id="footer" class="FR">
    	<hr>
        (34055) 대전광역시 유성구 대덕대로 776     전화: 080-373-3333(무료) / 042-865-3333(유료)     천문정보 ARS: 042-865-3332     팩스: 042-861-5610<br>
        Copyright (C) 2017 Korea Astronomy and Space Science Institute. All Rights Reserved.
      </div>
	</footer>

</body>
</html>