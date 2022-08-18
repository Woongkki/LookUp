

<%@page import="kr.or.ddit.member.vo.MessegeVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOOKUP</title>

<link rel="shortcut icon" href="../images/별.png" type="image/x-icon">

<script src="../js/jquery-3.6.0.min.js"></script>
<!-- <link rel="stylesheet" href="http://localhost/lookupProject/css/board.css"> -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/memberUpdate(수정).css">
<!-- <link rel="stylesheet" href="http://lookupProject/css/btn.css"> -->


<style>
.mainContent {
	position: fixed;
	overflow: auto;
}

.titleUl {
	border: 3px dotted gray;
	display: inline-flex;
	flex-direction: row;
	align-items: baseline;
	justify-content: space-evenly;
	width: 90%;
	height: 200px;
	position: absolute;
}

.subTitle {
	margin-left: 50px;
	padding: 5px;
}

.titleBox {
	width: 80%;
	height: 200px;
	margin: 40px;
	padding: 10px;
}

.middleBox {
	display: flex;
	margin: 20px 50px 1px 50px;
	justify-content: space-between;
	width: 91%;
	height: 40px;
}

.midsearch {
	padding-top: 3px;
	margin-right: 40px;
	margin-top: 20px;
}

.midSpan {
	margin-left: 40px;
	font-size: 1.5em;
}

.midHr {
	margin-right: 120px;
}

table.type04 {
	border-collapse: separate;
	border-spacing: 1px;
	text-align: left;
	line-height: 1.5;
	border-top: 1px solid #ccc;
	margin: 20px 10px;
	margin-left: 60px;
	width: 90%;
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

table.tableNum1 {
	width: 3%;
}

table.tableNum2 {
	width: 50%;
}

table.tableNum3 {
	width: 15%;
}

table.tableNum4 {
	width: 15%;
}

table.tableNum5 {
	width: 15%;
}

#footer {
	position: fixed;
	bottom: 0;
	clear: both;
	width: 100%;
	height: 80px;
	color: black;
	background-color: white;
}

.pagination {
	display: inline-flex;
	justify-content: center;
	position: absolute;
	width: auto;
	height: 45px;
	text-align: center;
	border-bottom: none;
	background-color: white;
}

.pagination a {
	color: #444;
}

.pagination li {
	border: 1px solid gray;
	margin: auto 5px;
	width: 30px;
}

.pagination li.next {
	width: 65px;
}

.pagination li.last {
	width: 100px;
}

.pagination a:hover {
	text-decoration: underline;
	background-color: white;
}

/* 표 클릭 호버*/
.tablecilck:hover {
	background-color: #dedede;
	text-decoration: underline;
	font-weight: bold;
}

.page {
	width: 90%;
	height: 100px;
	display: inline-flex;
	justify-content: center;
}

/* 검색어 입력 옆 select박스*/
#listCheck {
	margin: 8px;
	width: 120px;
	height: 40px;
	border-radius: 8px;
}

/* 테이블 검색 창 */
#tableSearch {
	width: 250px;
}

/* 글쓰기 버튼 */
#create button {
	display: inline;
	float: right;
	width: 80px;
	height: 35px;
	position: absolute;
	top: 1050px;
	right: 130px;
	z-index: initial;
	padding: 5px 10px;
}

table.infoTable {
	border-collapse: collapse;
	text-align: left;
	line-height: 1.5;
	border-top: 1px solid #ccc;
	border-left: 3px solid #369;
	margin: 20px 10px;
}

table.infoTable th {
	width: 80px;
	padding: 10px;
	font-weight: bold;
	vertical-align: top;
	color: #153d73;
	border-right: 1px solid #ccc;
	border-bottom: 1px solid #ccc;
}

table.infoTable td {
	padding: 5px;
	color: black;
}

.infoMain {
	display: flex;
}

th {
	background-color: #FFD0CD;
}

#memupdate {
	display: inline-block;
	left: 100px;
}

input[type=button], .updateBtn {
	background-color: white;
	border: 1px solid #FF5675;
}
</style>
<script type="text/javascript">
$(function(){
	id=$('#id').val();
	$.ajax({
		url:'<%= request.getContextPath()%>/RecentView.do',
	    type:'get',
	    success:function(res){
	    	str="";
	str+='<tr>';
	str+='<th>제목</th>';
	str+='<th>내용</th>';
	str+='<th>생성일</th>';
	str+='</tr>';
	str+='	<div class="mycontent">';
	
	str+='</div>';
	    	
	    	
	    	$.each(res,function(i,v){
	    		str+="<tr><td>"+v.title+"</td>";
	    		  str+="<td>"+v.content+"</td>";
	    		  str+="<td>"+v.create_date+"</td></tr>";
	    	})
	    	$('table').html(str);
	    	
	    },
	    error:function(xhr){
	    	alert('상태 : '+xhr.status);
	    },
	    dataType:'json'
	})
})
</script>



</head>
<body>
	<div>

		<!-- 상단메뉴 -->
		<header>
			<nav>
				<div id="topMenu" class="FF">
					<div class="title">
						<a href="../main/main.jsp"> <img class="titleImg"
							alt="메인배너R.png" src="../images/메인배너R.png">
						</a>
					</div>

					<div class="dropdown FF topText">
						<a href="<%=request.getContextPath()%>/Logout.do" class="join">LOGOUT</a>
					</div>
					<div class="dropdown FF topText">
						<a href="../membermypage/mypageMenu.jsp" class="login">MYPAGE</a>
					</div>

					<div class="dropdown FF ">
						<button id="notice" class="dropbtn FF ahover">
							<span class="dropbtn_icon"></span> 공지
						</button>
						<div class="dropdown-content">
							<a href="<%=request.getContextPath()%>/selectNoticeList.do">공지사항</a>
							<a href="<%=request.getContextPath()%>/selectQnaList.do">자주
								묻는 질문</a> <a
								href="<%=request.getContextPath()%>/question/questionList.jsp">1:1문의</a>
						</div>
					</div>

					<div class="dropdown FF">
						<button class="dropbtn FF ahover">
							<span class="dropbtn_icon"></span> 게시판
						</button>
						<div class="dropdown-content">
							<a href="board(관측게시판).html">관측게시판</a> <a href="board(자유게시판).html">자유게시판</a>
							<a href="board(관측회게시판).html">관측회게시판</a>
						</div>
					</div>



				</div>
			</nav>
		</header>

		<aside>

			<ul style="border-radius: 0px 0px 40px 0px; background: black;" class="FR">
				<li><a href='<%=request.getContextPath()%>/membermypage/memberdetail.jsp'>회원정보수정</a></li>
				<li><a href='../mycontentcheck/mycontentview.jsp'>내 글 보기</a></li>
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
		<section>
			<div class="mainContent">
				<div class="subTitle">
					<h3>내 글 보기</h3>
					<!-- 소 제목 -->
				</div>
				<div class="passInputDiv" style="left: 150px; width: 850px;">

					<div class="memberInfo" style="margin: 20px;">
						<%
						MemberVO vo = (MemberVO) session.getAttribute("loginMember");
						%>
						<input type="hidden" id="id"
							name="<%=vo.getMem_id()%>" value='<%=vo.getMem_id()%>'>
						<table border='1' style="width: 90%; margin-left: 20px; color:black;" class="FF"> 
<!-- 							<tr> -->
<!-- 								<th>제목</th> -->
<!-- 								<th>내용</th> -->
<!-- 								<th>생성일</th> -->
<!-- 								<th>내용</th> -->
<!-- 								<th>생성일자</th> -->
<!-- 							</tr> -->
<!-- 							<div class="mycontent"> -->
<!-- 							</div> -->

 						</table> 

					</div>

				</div>
			</div>
		</section>
		
	</div>

	<footer id="footer">
		<div id="footer" class="FR">
			<hr>
			(34055) 대전광역시 유성구 대덕대로 776 전화: 080-373-3333(무료) / 042-865-3333(유료)
			천문정보 ARS: 042-865-3332 팩스: 042-861-5610<br> Copyright (C) 2017
			Korea Astronomy and Space Science Institute. All Rights Reserved.
		</div>
	</footer>


</body>
</html>