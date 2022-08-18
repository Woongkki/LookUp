<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel="shortcut icon" href="<%=request.getContextPath()%>/images/별.png" type="image/x-icon">

<meta charset="UTF-8">
<title>LOOK UP</title>

<script src="<%=request.getContextPath()%>/js/jquery-3.6.0.min.js"></script>
<script src="<%=request.getContextPath()%>/js/gif.js"></script>
<script src="<%=request.getContextPath()%>/js/board.js"></script>

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/board(관측게시판).css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/typing.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/btn.css">

<style>


.mainContent{
	position: fixed;
	overflow: auto;
}

.titleUl{
	border : 3px dotted gray;
	display: inline-flex;
	flex-direction: row;
	align-items: baseline;
	justify-content: space-evenly;
	
	width: 90%;
 	height: 200px;
 	position: absolute;
}


.subTitle{
	margin-left: 50px;
	margin-top: 40px;
	padding: 5px;	
	
}
.titleBox{
	width: 80%;
	height: 200px;
	margin: 40px;
		
	padding: 10px;
}


table.type04 {
  border-collapse: separate;
  border-spacing: 1px;
  text-align: left;
  line-height: 1.5;
  border-top: 1px solid #ccc;
  margin : 20px 10px;
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

#footer{
    position: fixed;
    bottom: 0;
    clear: both;
    width: 100%;
    height: 80px;
    color : black;
}
.pagination{
	display: inline-flex;
	justify-content: center;
	position: absolute;
	width: auto;
	height: 45px;
	text-align: center;
	border-bottom: none;
	background-color: white;	
}
.pagination a{
	color: #444;
}

.pagination li{
	border: 1px solid gray;
	margin: auto 5px;
	width : 30px;
}

.pagination li.next{
	width : 65px;
}
.pagination li.last{
	width : 100px;
}

.pagination a:hover{
	text-decoration: underline;
	background-color: white;
	
}

.page{
	width: 90%;
	height: 100px;
	display: inline-flex;
	justify-content: center;
}


</style>
<script src="<%=request.getContextPath() %>/js/jquery-3.6.0.min.js"></script>
<script>
	$(function() {
		
		$.ajax({
			url : '<%=request.getContextPath()%>/memList.do',
			type : 'get',
			
			success : function(res){
				str = "<table class='type04'>";
				
				str += "<tr style='background-color:#CEBEE1; color:white'>";
				
				str += "<th scope='row' class='tableNum1'>아이디</th>";
				str += "<th scope='row' class='tableNum2'>이 름</th>";
				str += "<th scope='row' class='tableNum3'>닉네임</th>";
				str += "<th scope='row' class='tableNum4'>주 소</th>";
				str += "<th scope='row' class='tableNum5'>번 호</th>";
				
				str += "</tr>";
				
				$.each(res, function(i, v){
					str += "<tr>";
					
					str += "<td>" + v.mem_id + "</td>";
					str += "<td><a href='#' style='color:black; text-decoration-line: none;' class='memHover' >" + v.mem_name + "</a></td>";
					str += "<td>" + v.mem_nickname + "</td>";
					str += "<td>" + v.mem_addr2 +"&nbsp;" +  v.mem_addr3 + "&nbsp;" + v.mem_addr1 + "</td>";
					str += "<td>" + v.mem_tel + "</td>";
					
					str += "</tr>";
				})
				str += "</table>";
				$('#result').html(str);
			},
			error : function(xhr){
				alert("상태 : " + xhr.status);
			},
			dataType : 'json'
		})
		
		// 상세 조회 페이지로 넘어가기
		$('#result').on('click', '.memHover', function(){
			alert($(this).text());
			
			
		})
		
	})
</script>

</head>
<body>

<!-- 상단메뉴 -->
	<header>
	<nav>
			<div id="topMenu" class="FF">
				<div class="title">
					<a href="<%=request.getContextPath() %>/main/main.jsp">
						<img class="titleImg" alt="메인배너R.png" src="<%=request.getContextPath() %>/images/메인배너R.png">
					</a>
				</div>

				<div class="dropdown FF topText">
				<a href="<%=request.getContextPath()%>/Logout.do" class="join">LOGOUT</a>		
			</div>
			<div class="dropdown FF topText">
				<a href="<%=request.getContextPath() %>/membermypage/mypageMenu.jsp" class="login">MYPAGE</a>
			</div>

				<div class="dropdown FF ">
					<button id="notice" class="dropbtn FF ahover">
						<span class="dropbtn_icon"></span> 공지
					</button>
					<div class="dropdown-content">
						<a href="<%=request.getContextPath() %>/selectNoticeList.do">공지사항</a> 
						<a href="<%=request.getContextPath() %>/selectQnaList.do">자주 묻는 질문</a> 
				<%if(session.getAttribute("loginMember")!=null){ 
				%> 
						<a href="<%=request.getContextPath() %>/question/questionList.jsp">1:1문의</a>
				<% 
				}
				%>
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

		<ul style="border-radius: 0px 0px 40px 0px; background: black" class="FR">
			<li><a href='memberdetail.jsp'>회원정보수정</a></li>
			<li><a href='<%= request.getContextPath()%>/mycontentcheck/mycontentview.jsp'>내 글 보기</a></li>
			<!-- 문의관리서블릿 따로 만들어야함 -->
			<li><a href='<%=request.getContextPath() %>/question/questionList.jsp'>문의관리</a></li>
			<li><a href='<%= request.getContextPath()%>/BlockMember.do'>차단사용자 관리</a></li>
			<li><a href='<%= request.getContextPath()%>/ObserveCheck.do'>관측회 신청 현황</a></li>
			<li><a href='<%= request.getContextPath()%>/schedule/memSchedule.jsp'>관심 일정 관리</a></li>
		</ul>


	</aside>
	
	<section>
		<div class="mainContent">
		 <div class="subTitle">
		  	<h1 class="FF" style="color:black"> 회원 목록 </h1> <!-- 소 제목 -->
		  </div>
		
		<!-- 글 목록, 글 출력은 총 10개까지 나머지 글은 페이지를 다르게-->
			<div id="result">
			<table class="type04">
  				<tr>
	    			<th scope="row" class="FF tableNum1">아이디</th>
	    			<th scope="row" class="tableNum2">이 름</th>
	    			<th scope="row" class="tableNum5">닉네임</th>
	    			<th scope="row" class="tableNum3">주 소</th>
	    			<th scope="row" class="tableNum4">번 호</th>
  				</tr>
  				<tr>
    				<th scope="row">1</th>
    				<td><input type="text" id="memId" name="mem_id"></td>
    				<td><input type="text" id="memName" name="mem_name"></td>
    				<td><input type="text" id="memNick" name="mem_nickname"></td>
    				<td><input type="text" id="memAddr1" name="mem_addr1"></td>
    				<td><input type="text" id="memAddr2" name="mem_addr2"></td>
    				<td><input type="text" id="memAddr3" name="mem_addr3"></td>
    				<td><input type="text" id="memTel" name="mem_tel"></td>
    				<!-- 마지막 로그인 기록 추가 -->
  				</tr>
			</table>
			</div>
        
<!--         <hr> -->
        <nav class="page">
		  <ul class='pagination'>
			  <li class='active' title='현재 페이지'><a href='#'>1</a></li>
		  </ul>
		</nav>
		
        
        </div>
	</section>
	
	<footer id="footer">
 	  <div id="footer" class="FR">
    	<hr>
        (34055) 대전광역시 유성구 대덕대로 776     전화: 080-373-3333(무료) / 042-865-3333(유료)     천문정보 ARS: 042-865-3332     팩스: 042-861-5610<br>
        Copyright (C) 2017 Korea Astronomy and Space Science Institute. All Rights Reserved.
      </div>
	</footer>

</body>
</html>