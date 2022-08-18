<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>Insert title here</title>

<style type="text/css">
	table, tr, td { border:3px solid green; border-collapse: collapse;   margin : auto;	 }
	td { padding:5px;}
	body{
	  text-align: center;
	  
	}
	input[button]{
	 background: blue;
	}
	td{
	 background: nightblue;
	}
	
</style>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.6.0.min.js"></script>

<script type="text/javascript">
$(function(){
	
	
	
	$("#idCheck").on("click", function(){
		
		var memId = $("#mem_id").val();
		if(memId==""){
			alert("ID를 입력하세요");
			return;
		}
		$.ajax({
	    	 url : '<%=request.getContextPath()%>/MemberIdCheck.do',
	    		
			 data :{"mem_id":memId},
	    	 dataType : 'json',
	    	 success : function(result){
	    		 if(result=="ok"){
	    			 $("#idChkResult").html("사용가능");	
	    		 }else{
	    			 $("#idChkResult").html("ID 중복 - 사용불가");
	    		 }
	    	 },
	    	 error : function(xhr){
	    		 alert("status :" + xhr.status);
	    	 }
	     })
	});
	
	
	$("#memberForm").on("submit", function(){
	
	
		
		var idchk = $("#idChkResult").html();
		if(idchk!="사용가능"){
			alert("ID 중복되거나 중복체크를 하지 않았습니다.");
			return false;  // 전송 중단.
		}
		if($("#mem_pass").val()!= $("#mem_pass2").val()){
			alert("비밀번호와 비밀번호 확인이 다릅니다. 다시 확인하세요.");
			return false;
		}
	   if($("#name").val().trim()==""||$("#addr1").val().trim()==""||$("#addr2").val().trim()==""||$("#addr3").val().trim()==""||
			   $("#mem_nickname").val().trim()==""|| $("mem_nickname").val().trim()==""||$("mem_birth").val().trim()==""){
		   alert("필수 입력사항중 입력되지않은 항목 존재!!")
		   return false;
	   }
		
		 
		     return true;
		   })
		   
	
		
          
		
           
	
	
	
	
	  $('#aSearch').on('click',function(){
		  
		  window.open("우편번호.html","우편번호","width=500 height=400");
		  
	  })	
	
});

</script>
</head>


<body>
<h2>look up 회원가입</h2>
<form id="memberForm" method="post" action="<%=request.getContextPath()%>/insertMember.do" enctype="multipart/form-data">
<table border="1">
<tbody>
	<tr>
		<td>회원ID</td>
		<td>
			<input type="text" name="mem_id" id="mem_id">
			<input id="idCheck" type="button" value="중복확인"><br>
			<span id="idChkResult"></span>
		</td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type="password" name="mem_pass" id="mem_pass"></td>
	</tr>
	<tr>
		<td>비밀번호 확인</td>
		<td><input type="password" name="mem_pass2" id="mem_pass2"></td>
	</tr>	
	<tr>
		<td>회원이름</td>
		<td><input type="text" name="mem_name" id="name"></td>
	</tr>
	
	<tr>
		<td>닉네임</td>
		<td><input type="text" name="mem_nickname"></td>
	</tr>
	<tr>
	
	<td>성별</td>
	<td>
	<select name="mem_gender" id='mem_gender'>

<option value='남자' class='gender'>남자</option>
<option value='여자'  class='gender'>여자</option>
</select>
	</td>
	</tr>
	<tr>
		<td>생일</td>
		<td><input type='date' name="mem_birth" id='mem_birth'></td>
	</tr>	
	
	<tr>
		<td>전화번호</td>
		<td><input type="text" name="mem_tel"></td>
	</tr>
	<tr>
		<td>우편주소</td>
		<td><input type="text" name="mem_addr1" id='addr1' readonly="readonly"><input type="button" id='aSearch' value="우편번호 찾기" ></td>
		
	</tr>
	<tr>
		<td>주소</td>
		<td><input type="text" name="mem_addr2" id='addr2'readonly="readonly"></td>
	</tr>
		<tr>
		<td>상세주소</td>
		<td><input type="text" name="mem_addr3" id='addr3'></td>
	</tr>
	<tr>
		<td>프로필 사진</td>
		<td><input type="file" name="mem_photo"></td>
	</tr>
	<tr>
		<td colspan="2" style="text-align:center;">
			<input type="submit" value="가입"> 
			<input type="reset" value="취소">
			
	</tr>
</tbody>
</table>
</form>
</body>
</html>