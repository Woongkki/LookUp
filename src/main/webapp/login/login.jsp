<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel="shortcut icon" href="../images/별.png" type="image/x-icon">
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="../css/font.css">

<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/logout.js"></script>


<script  language="javascript">
function closePage( event ){
	 alert("??")
    if( event.clientY < 0 ){
    	
    	  location.href='/lookupProject/Logout.do';
    		 
    }

 }

 document.onkeydown = function() {
  
}

</script>

<style>

@import url('https://fonts.googleapis.com/css?family=Raleway:200');


html, body {
  height: 100%;
}
body {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100%;
  background-image: url("../images/게시판워터마크.png");
}
#box {
  display: flex;
  align-items: center;
  justify-content: center;
  width: 400px;
  height: 200px;
  color: white;
  font-family: 'Raleway';
  font-size: 2rem;
  font-weight: bold;
}
.gradient-border {
  --borderWidth: 10px;
/*   background: #1D1F20; */
background : white;
  position: relative;
  border-radius: var(--borderWidth);
}
.gradient-border:after {
  content: '';
  position: absolute;
  top: calc(-1 * var(--borderWidth));
  left: calc(-1 * var(--borderWidth));
  height: calc(100% + var(--borderWidth) * 2);
  width: calc(100% + var(--borderWidth) * 2);
  background: linear-gradient(60deg, #f79533, #f37055, #ef4e7b, #a166ab, #5073b8, #1098ad, #07b39b, #6fba82);
  border-radius: calc(2 * var(--borderWidth));
  z-index: -1;
  -webkit-animation: animatedgradient 3s ease alternate infinite;
          animation: animatedgradient 3s ease alternate infinite;
  background-size: 300% 300%;
}


@-webkit-keyframes animatedgradient {
  0% {
    background-position: 0% 50%;
  }
  50% {
    background-position: 100% 50%;
  }
  100% {
    background-position: 0% 50%;
  }
}


@keyframes animatedgradient {
  0% {
    background-position: 0% 50%;
  }
  50% {
    background-position: 100% 50%;
  }
  100% {
    background-position: 0% 50%;
  }
}

/* 버튼 */
.btnTr{
       position: absolute;
    /* float: right; */
    right: 52px;
}

.backBtn{
	position: relative;
    top: 35px;
    float: right;
    margin: 3px;
}


.gradient-btn {
     display: revert;
    height: 7px;
    top: 10px;
/*     padding: 6px; */
/*     padding-top: 12px; */
    border-radius: 0;
    color: black;
    font-size: 0.7em;
    letter-spacing: 2px;
    text-transform: uppercase;
    text-decoration: none;
    background: linear-gradient(to right, rgba(178, 135, 111, 0) 25%, rgba(0, 0, 0, 0.8) 75%);
    background-position: 1% 50%;
    background-size: 350% 300%;
    border: 1px solid black;
    transition: 700ms cubic-bezier(0.165, 0.84, 0.44, 1);
    border-radius: 5px;
}
.gradient-btn:hover {
  transition: 400ms cubic-bezier(0.165, 0.84, 0.44, 1);
}
.gradient-btn:hover {
  color: white;
  color: #fff;
  background-position: 99% 50%;
}


</style>

</head>
<body>

	<div class="gradient-border" id="box">

		<div class="loginMain FK" style="color: black">
			<form action="<%=request.getContextPath()%>/Login.do" method="get"
				class="loginMainForm">
				<table class="loginTable FK">
					<tr>
							<td class="FK" style="position: absolute; top: 54px;">아이디</td>
						<td><input type='text' name="memid" style="height:20px;"></td>
					</tr>
					<tr>
						<td style="position: relative; top: 8px;">비밀번호</td>
						<td><input type="password" name="mempass" style="height:20px;"></td>
					</tr>
					<tr class="btnTr">
						<td class="loginBtn" id="s">
						<input type="submit" value='로그인' class="Button js-button gradient-btn" style="height: 30px; font-size: small; margin-bottom: 10px;"></td>
						
						<td class="loginBtn" id="s">
						<a href="<%=request.getContextPath()%>/login/join.jsp">
						<input type="button" value='회원가입' class="Button js-button gradient-btn" style="height: 30px; font-size: small; margin-bottom: 10px;"></td>
						</a>
					</tr>
				</table>
				<a href="../main/main.jsp">
					<input class="backBtn gradient-btn" type="button" value="뒤로가기" style="height: 30px; font-size: small; margin-bottom: 10px; top: 40px;">
				</a>
			</form>

		</div>
	</div>

</body>
</html>