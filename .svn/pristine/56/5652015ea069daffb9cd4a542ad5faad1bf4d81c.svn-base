<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<%
   Cookie[] cookies = request.getCookies();
   
   String user = "";
   String check = "";
   
   if(cookies != null){
      for(Cookie cookie : cookies){
         if(cookie.getName().equals("user")){
            user = cookie.getValue();
         }
      }
   }
%>
<meta charset="UTF-8">
<title>글 생성 페이지</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
  <script src="<%=request.getContextPath()%>/summernote/js/summernote-lite.js"></script>
  <script src="<%=request.getContextPath()%>/summernote/js/lang/summernote-ko-KR.js"></script>
  <script src="<%=request.getContextPath()%>/js/Observers.js"></script>
  <link rel="stylesheet" href="<%=request.getContextPath()%>/summernote/css/summernote-lite.css">

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/board.css">
<script>
$(function(){
	// 서머노트 로딩
	$(document).ready(function(){
		$('#content').summernote({
			height : 300,			// 에디터 높이
			minHeight: 50, 		// 최소 높이
			maxHeight: null, 	// 최대 높이
			focus : true,		// 에디터 로딩후 포커스를 맞출지 여부
			lang : "ko-KR",		// 한글 설정
			placeholder: '내용을 입력해주세요.'
		});
	})
	
	$('#insertCancle').on('click', function(){
		$.ajax({
			url : '<%=request.getContextPath()%>/InsertBoard.do',
			data : {
				"memId" : "dddd",
				"titleInput" : $('#titleInput').val(),
				"content" : $('#content').val()
			} ,
			type : 'post',
			
			success : function(res){
				alert("res");
				if(res == "성공"){
					alert("등록에 성공했습니다.");
					location.href = "<%=request.getContextPath()%>/LOOKUP/board(갤러리게시판).jsp";
				}else{
					alert("등록에 실패했습니다.");				
				}
			},
			error : function(xhr){
				alert("상태 : " + xhr.status)
			},
			dataType : 'json'
		})
	})
	
	$('#insertContent').on('click', function(){
		location.href = "<%=request.getContextPath()%>/LOOKUP/board(갤러리게시판).jsp"
	})
})
</script>


<style>

#topMenu{
	height: 70px;
}


.mainContent{
	width: 100%;
	position: fixed;
	overflow: auto;
	border : 1px solid gray;
	margin: 0px;
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


.subbox{
	margin-left: 70px;
	margin-top: 40px;
	padding: 5px;	
	
}
.titleBox{
	width: 80%;
	height: 200px;
	margin: 40px;
		
	padding: 10px;
}
.titleInline{
	display: flex;
	justify-content: space-between;
	width: 95%;
}

/* 댓글 출력 관련 style*/
.CommentBox .comment_list .comment_nick_box {
    margin-bottom: 4px;
}

.CommentBox ul{
	display: block;
    list-style-type: disc;
    margin-block-start: 1em;
    margin-block-end: 1em;
    margin-inline-start: 0px;
    margin-inline-end: 0px;
    padding-inline-start: 40px;
}
.comment_list ul{
	display: block;
    list-style-type: disc;
    margin-block-start: 1em;
    margin-block-end: 1em;
    margin-inline-start: 0px;
    margin-inline-end: 0px;
    padding-inline-start: 40px;
}

.CommentBox .comment_list .comment_text_box {
    position: relative;
    font-size: 13px;
    word-break: break-all;
    word-wrap: break-word;
}
.CommentBox .comment_list .comment_info_box {
    margin-top: 7px;
    font-size: 12px;
    color: var(--skinText979797);
}
.CommentBox .comment_list .comment_tool {
    position: absolute;
    top: 12px;
    right: 0;
}
.CommentBox .comment_list .comment_area {
    position: relative;
    padding: 12px 23px 10px 0;
}


dl, ol, ul {
    list-style: none;
    
}

.subbox a{
	color: black;
}


/* 댓글 작성 관련 style  */
.CommentBox {
    margin-top: -17px;
    border-top: 1px solid #ebecef;
}
.CommentWriter {
    margin: 12px 0 29px;
    padding: 16px 10px 10px 18px;
    border: 2px solid rgba(0, 0, 0, 0.1);
    border-radius: 6px;
    box-sizing: border-box;
    background: #ffffff;
}
.CommentWriter .comment_inbox {
    position: relative;
    margin-bottom: 10px;
}
.blind {
    position: absolute;
    clip: rect(0 0 0 0);
    width: 1px;
    height: 1px;
    margin: -1px;
    overflow: hidden;
}
.CommentWriter .comment_inbox_name {
    display: block;
    margin-bottom: 10px;
    font-weight: 700;
    font-size: 13px;
}
textarea.comment_inbox_text[data-v-3b426d7d] {
    max-height: 500px;
}
.CommentWriter .comment_inbox_text {
    overflow-x: hidden;
    overflow-y: auto;
    display: block;
    width: 100%;
    min-height: 17px;
    padding-right: 1px;
    border: 0;
    font-size: 13px;
    -webkit-appearance: none;
    resize: none;
    box-sizing: border-box;
    background: transparent;
    color: #000000;
    outline: 0;
}
button, textarea {
    font-family: "Apple SD Gothic Neo", "맑은 고딕", "Malgun Gothic", 돋움, dotum, sans-serif;
}
.CommentWriter .comment_attach {
    position: relative;
}
.CommentWriter .register_box {
    float: right;
}
.CommentWriter .register_box .button {
    display: inline-block;
    min-width: 46px;
    height: 34px;
    line-height: 36px;
    font-size: 13px;
    color: #b7b7b7;
    border-radius: 6px;
    box-sizing: border-box;
    font-weight: 700;
    text-align: center;
    vertical-align: top;
}
.CommentWriter .comment_attach:after {
    content: "";
    display: block;
    clear: both;
}

#insertbutton{
	margin-right: 80px;
	margin-top : 10px;
	overflow: hidden;
	height: auto;
}

#insertbutton input{
	width: 80px;
	height: 40px;
	float: right;
	margin-right: 20px;
}

/* 서머노트 배경색 */
.note-editable{
	background-color: white;
}
/* 서머노트 너비 */
.note-editor{
	width: 95%;
}

/* 제목 입력 관련*/
#titleInputbox{
	overflow: hidden;
	height: auto;
}
#titleInput {
    padding: 0 25px 0 11px;
    border: 2px solid #00000032;
    background: #fff;
    text-align: left;
    box-sizing: border-box;
    color: #000;
    cursor: pointer;
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
    height: 35px;
    font-size: 1.1em;
    width: 30%;
}

/* 게시판 선택 select 박스 관련 */
#noticeBoard {
    width: 27%;
    height: 35px;
    border: 2px solid #00000032;
    border-radius: 8px;
    font-size: 1.2em;
}


</style>


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
			
		
			
			<%if(session.getAttribute("loginMember")==null){ 
			%>
				<div class="dropdown FF topText">
				<a href="<%=request.getContextPath() %>/login/join.jsp" class="login">JOIN</a>	
			</div>
			<div class="dropdown FF topText">
				<a href="<%=request.getContextPath() %>/login/login.jsp" class="login">LOGIN</a>
			</div>
			<%
			}else{
			%>
				<div class="dropdown FF topText">
				<a href="<%=request.getContextPath()%>/Logout.do" class="join">LOGOUT</a>		
			</div>
			<div class="dropdown FF topText">
				<a href="<%=request.getContextPath()%>/membermypage/mypageMenu.jsp" class="login">마이페이지</a>
			</div>
			
			<% 
			}
			%>
		
			
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

	
	<!-- 상세 내역 출력 공간 -->
	
	<!-- 제목 -->
	<section>
		<div class="mainContent">
		  <div class="subbox">
	  	    <h2> 🪐 관측 게시판 글쓰기</h2>
		  </div>
		  <hr style="width: 92%">
		  
		  <!-- 내용 작성 -->
		  <div class="subbox">
	  	      <label for="noticeBoard">카테고리 선택</label>
	  	      <select name="noticeBoard" id="noticeBoard">
	  	    	<option value="observer"> 관측기기 게시판 </option>
	  	    	<option value="free"> 갤러리 게시판 </option>
	  	    	<option value="gallery"> 관측Tip 갤러리 </option>
	  	      </select>
	  	      <br>
		        
	  	      <div id="titleInputbox">
 	  	      <label for="titleInput">제목 : </label>
 	  	      <input id="titleInput" type="text" placeholder="제목을 입력하세요" style="/* width:80%; */">
<!-- 		  <input id="titleInput" type="text" placeholder="제목을 입력하세요" style="width:80%"> -->
		      </div>
		      
		      
		  		  
		      <br><br>
		      <textarea id="content" name="content"></textarea>
		      
		      <div id="insertbutton">
		        <input id="insertContent" type="button" value="취소">
		        <input id="insertCancle" type="button" value="등록">
		      </div>
		      
		  		  
		  <hr style="width: 92%">
		  
		  		  
		<br><br><br><br><br><br>
		  
		  
		  
		  </div><!-- subbox div -->
		  
        
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