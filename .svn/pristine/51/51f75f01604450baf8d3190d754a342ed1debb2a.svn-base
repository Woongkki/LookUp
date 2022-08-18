<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 생성 페이지</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <script src="<%=request.getContextPath() %>/js/jquery-3.6.0.min.js"></script>
  <script src="<%=request.getContextPath()%>/summernote/js/summernote-lite.js"></script>
  <script src="<%=request.getContextPath()%>/summernote/js/lang/summernote-ko-KR.js"></script>
  <script src="<%=request.getContextPath()%>/js/Observers.js"></script>
  <link rel="stylesheet" href="<%=request.getContextPath()%>/summernote/css/summernote-lite.css">

<link rel="stylesheet" href="../css/board.css">
<script>
$(function(){
	// 서머노트 로딩
	$(document).ready(function(){
		$('#content').summernote({
			height : 300,			// 에디터 높이
			minHeight: 50, 	// 최소 높이
			maxHeight: null, 	// 최대 높이
			focus : true,		// 에디터 로딩후 포커스를 맞출지 여부
			lang : "ko-KR",		// 한글 설정
			placeholder: '내용을 입력해주세요.'
		});
	})
	
	$('#insertCancle').on('click',function(){
		location.href='<%=request.getContextPath()%>/board/board2.jsp';
	
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
	margin-right: 20px;
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
#titleInput{
	padding: 0 25px 0 11px;
    border: 1px solid #00000032;
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
}

/* 게시판 선택 select 박스 관련 */
#noticeBoard{
	width: 70%;
	height: 35px;
	border: 1px solid #00000032;
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
					<a href="../example/main.html">
						<img class="titleImg" alt="메인배너R.png" src="../images/메인배너R.png">
					</a>
				</div>

				<div class="dropdown FF topText">
					<a href="#" class="join">JOIN</a>
				</div>

				<div class="dropdown FF topText">
					<a href="#" class="login">LOGIN</a>
				</div>


				<div class="search">
					<input type="text" placeholder="검색어 입력"> 
					<img src="https://s3.ap-northeast-2.amazonaws.com/cdn.wecode.co.kr/icon/search.png">
				</div>



				<div class="dropdown FF ">
					<button id="notice" class="dropbtn FF ahover">
						<span class="dropbtn_icon"></span> 공지사항
					</button>
					<div class="dropdown-content">
						<a href="#">공지사항</a> 
						<a href="#">자주 묻는 질문</a> 
						<a href="#">1:1문의</a>
					</div>
				</div>

				<div class="dropdown FF">
					<button class="dropbtn FF ahover">
						<span class="dropbtn_icon"></span> 게시판
					</button>
					<div class="dropdown-content">
						<a href="board(관측게시판).html">관측게시판</a> 
						<a href="board(자유게시판).html">자유게시판</a> 
						<a href="board(관측회게시판).html">관측회게시판</a>
					</div>
				</div>
			</div>
	</nav>
	</header>

	
	<!-- 상세 내역 출력 공간 -->
	
	<!-- 제목 -->
   <form action="<%=request.getContextPath()%>/FreeBoardWhrite.do" method='post' id='info'>
	<section>
		<div class="mainContent">
		  <div class="subbox">
	  	    <h3>자유게시판 글쓰기</h3>
		  </div>
		  <hr style="width: 92%">
		  
		  <!-- 내용 작성 -->
		  <div class="subbox">
	  	      <label for="noticeBoard">게시판을 선택해 주세요! :</label>
	  	      <select name="noticeBoard" id="noticeBoard">
	  	        <option value="free"> 자유 게시판 </option>
	  	    	<option value="observer"> 관측 게시판 </option>
	  	    	<option value="gallery"> 천문 갤러리 </option>
	  	      </select>
	  	      <br>
		        
	  	      <div id="titleInputbox">
 	  	      <label for="titleInput">제목 : </label>
		        <input id="titleInput" type="text" placeholder="제목을 입력하세요" style="width:80%" name='title'>
		      </div>
		      
		      
		  		  
		      <br><br>
		      <textarea id="content" name="content"></textarea>
		      
		      <div id="insertbutton">
		        <input id="insertCancle" type="button" value="취소">
		        <input id="insertContent" type="submit" value="등록">
		      </div>
		      </form>
		  		  
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